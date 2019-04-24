package com.xa.Dao;

import com.xa.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class UserDao extends BaseDao{
     public List<User> selectUser(String seek) throws IOException {
         List<User> ulist = null;
         SqlSession sqlSession = this.getSqlSession();
         ulist = sqlSession.selectList("findById", "%" + seek + "%");
         sqlSession.commit();
         return  ulist;
     }
}
