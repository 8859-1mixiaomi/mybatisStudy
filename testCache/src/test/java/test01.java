import entity.UserSix;
import jdk.internal.org.objectweb.asm.Handle;
import mapper.UserSixMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import util.mybatisSixUtil;

import java.util.HashMap;

public class test01 {

    @Test
    public void user01() {
        SqlSession sqlSession = mybatisSixUtil.getSqlSession();
        SqlSession sqlSession2 = mybatisSixUtil.getSqlSession();

        UserSixMapper mapper = sqlSession.getMapper(UserSixMapper.class);
        UserSixMapper mapper2 = sqlSession2.getMapper(UserSixMapper.class);

        UserSix userSix = mapper.queryUserById(1);
        System.out.println(userSix);
        UserSix userSix2 = mapper2.queryUserById(1);
        System.out.println(userSix2);
        System.out.println(userSix == userSix2);
        sqlSession.close();
    }


    @Test
    public void test02() {
        SqlSession sqlSession = mybatisSixUtil.getSqlSession();
        UserSixMapper mapper = sqlSession.getMapper(UserSixMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("name", "小可怜");
        map.put("id", 3);
        int i = mapper.updateUser(map);
        System.out.println(i);
        UserSix userSix2 = mapper.queryUserById(3);
        System.out.println(userSix2);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void test03() {
        SqlSession sqlSession = mybatisSixUtil.getSqlSession();
        UserSixMapper mapper = sqlSession.getMapper(UserSixMapper.class);
        UserSix userSix = mapper.queryUserById(1);
        System.out.println(userSix);
        sqlSession.clearCache();
        UserSix userSix1 = mapper.queryUserById(1);
        System.out.println(userSix1);
        System.out.println(userSix==userSix1);
        sqlSession.close();

    }

    @Test
    public void test04(){
        SqlSession sqlSession = mybatisSixUtil.getSqlSession();
        SqlSession sqlSession2 = mybatisSixUtil.getSqlSession();
        UserSixMapper mapper = sqlSession.getMapper(UserSixMapper.class);
        UserSixMapper mapper2 = sqlSession2.getMapper(UserSixMapper.class);

        UserSix userSix = mapper.queryUserById(1);
        System.out.println(userSix);
        sqlSession.close();

        UserSix userSix1 = mapper2.queryUserById(1);
        System.out.println(userSix1);
        System.out.println(userSix==userSix1);
        sqlSession2.close();


    }
















}
