import entity.UserThree;
import mapper.UserThreeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import util.MybatisThreeUtil;

import java.util.List;

public class UserThreeUser {


    @Test
    public void test01() {
        SqlSession sqlSession = MybatisThreeUtil.getSqlSession();
        UserThreeMapper mapper = sqlSession.getMapper(UserThreeMapper.class);
        List<UserThree> allUser = mapper.getAllUser();
        for (UserThree userThree : allUser) {
            System.out.println(userThree);
        }
        sqlSession.close();

    }

    @Test
    public void test02() {
        SqlSession sqlSession = MybatisThreeUtil.getSqlSession();
        UserThreeMapper mapper = sqlSession.getMapper(UserThreeMapper.class);
        UserThree userThree = mapper.selectUserById(11);
        System.out.println(userThree);
        sqlSession.close();
    }

    @Test
    public void test03() {
        SqlSession sqlSession = MybatisThreeUtil.getSqlSession();
        UserThreeMapper mapper = sqlSession.getMapper(UserThreeMapper.class);
        UserThree user = new UserThree();
        user.setName("琪琪");
        user.setPwd("1111111118");
        int i = mapper.addUserThree(user);
        sqlSession.commit();
        System.out.println(i);
        sqlSession.close();
    }


    @Test
    public void test04() {
        SqlSession sqlSession = MybatisThreeUtil.getSqlSession();
        UserThreeMapper mapper = sqlSession.getMapper(UserThreeMapper.class);
        UserThree userThree = new UserThree();
        userThree.setId(14);
        userThree.setName("七七");
        userThree.setPwd("1111111100");
        int i = mapper.updateUserThree(userThree);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void test05() {
        SqlSession sqlSession = MybatisThreeUtil.getSqlSession();
        UserThreeMapper mapper = sqlSession.getMapper(UserThreeMapper.class);
        int i = mapper.deleteUserThree(14);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }


}
