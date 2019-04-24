package com.xa.Dao;

import com.xa.pojo.UserInfo;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class UserInfoDao extends BaseDao{
    public void addUserInfo(UserInfo userInfo) throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        sqlSession.insert("addUserInfo",userInfo);
        sqlSession.commit();
        sqlSession.close();

    }
    public void updateUserInfo(UserInfo userInfo) throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        sqlSession.update("updateUserInfo",userInfo);
        sqlSession.commit();
        sqlSession.close();
    }
    public void delectUserInfo(int uid) throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        sqlSession.delete("delectUserInfo",uid);
        sqlSession.commit();
        sqlSession.close();
    }
    public List<UserInfo> selectUserInfoBy(UserInfo userInfo) throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        List<UserInfo> ulist = sqlSession.selectList("selectUserInfoBy",userInfo);
        sqlSession.commit();
        sqlSession.close();
        return ulist;

    }

    public List<UserInfo> infoUniteRole() throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        List<UserInfo> ulist = sqlSession.selectList("infoUniteRole");
        sqlSession.commit();
        sqlSession.close();
        return ulist;
    }
}
