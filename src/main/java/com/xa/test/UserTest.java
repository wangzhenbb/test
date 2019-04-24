package com.xa.test;

import com.xa.Dao.UserDao;
import com.xa.Dao.UserInfoDao;
import com.xa.pojo.User;
import com.xa.pojo.UserInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class UserTest {
    public static void main(String[] args) throws IOException {
//        String resource = "mybatis-config.xml";
//        Reader reader = null;
//        try {
//            reader = Resources.getResourceAsReader(resource);
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//            SqlSession session = sqlSessionFactory.openSession();
//            User user = session.selectOne("findById", 1);
//            session.commit();
//            System.out.println(user.getUser());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        UserDao uDao = new UserDao();
//        try {
//            List<User> ulist = null;
//            ulist = uDao.selectUser("爱");
//            for (User u:ulist) {
//                System.out.println(u.getUser());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        UserInfoDao userInfoDao = new UserInfoDao();
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUserName("bbbbbb");
//        userInfo.setPassword("111111");
//        userInfoDao.addUserInfo(userInfo);
//        userInfo.setUserId(2);
//        userInfo.setUserName("aaabbb");
//        userInfo.setPassword("111222");
//        userInfoDao.updateUserInfo(userInfo);
//        userInfoDao.delectUserInfo(4);
//        userInfo.setUserId(5);
//        userInfo.setUserName("bbbbbb");
//        userInfo.setPassword("111111");
//        List<UserInfo> userInfos = userInfoDao.selectUserInfoBy(userInfo);
//        for (UserInfo u:userInfos) {
//            System.out.println(u);
//        }
        List<UserInfo> userInfos = userInfoDao.infoUniteRole();
        for (UserInfo u:userInfos) {
            System.out.println(u);
        }
    }
}