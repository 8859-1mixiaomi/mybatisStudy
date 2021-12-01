import entity.UserOne;
import mapper.UserOneMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import util.MybatisUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test01 {

    @Test
    public void testUser01() {
        SqlSession session = MybatisUtil.getSession();
        UserOneMapper mapper = session.getMapper(UserOneMapper.class);
        UserOne userOne = mapper.selectUserById(1);
        System.out.println(userOne);
        session.close();

    }

    @Test
    public void testUser02() {
        SqlSession session = MybatisUtil.getSession();
        UserOneMapper mapper = session.getMapper(UserOneMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "小五");
        map.put("pwd", "1111111117");
        UserOne userOne = mapper.selectUserByNP02(map);
        System.out.println(userOne);
        session.close();
    }


    @Test
    public void testUser03() {
        SqlSession session = MybatisUtil.getSession();
        UserOneMapper mapper = session.getMapper(UserOneMapper.class);
        UserOne userOne = new UserOne();
        userOne.setName("小六");
        userOne.setPwd("1111111118");
        int i = mapper.addUserOne(userOne);
        session.commit();//提交事务,重点!不写的话不会提交到数据库
        System.out.println(i);
        session.close();
    }


    @Test
    public void testUser04() {
        SqlSession session = MybatisUtil.getSession();
        UserOneMapper mapper = session.getMapper(UserOneMapper.class);
        UserOne userOne = new UserOne();
        userOne.setId(13);
        userOne.setName("溜溜");
        userOne.setPwd("1111111888");
        int i = mapper.updateUserOne(userOne);
        session.commit();
        System.out.println(i);
        session.close();
    }


    @Test
    public void testUser05() {
        SqlSession session = MybatisUtil.getSession();
        UserOneMapper mapper = session.getMapper(UserOneMapper.class);
        UserOne userOne = new UserOne();
        userOne.setId(13);
        int i = mapper.deleteUserOne(userOne);
        System.out.println(i);
        session.commit();
        session.close();

    }

    @Test
    public void testUser06() {
        SqlSession session = MybatisUtil.getSession();
        UserOneMapper mapper = session.getMapper(UserOneMapper.class);
        String str = "%小%";
        List<UserOne> userOnes = mapper.likeUserOne01(str);
        for (UserOne userOne : userOnes) {
            System.out.println(userOne);
        }
        session.close();

    }


    @Test
    public void testUser07() {
        SqlSession session = MybatisUtil.getSession();
        UserOneMapper mapper = session.getMapper(UserOneMapper.class);
        String str = "小";
        List<UserOne> userOnes = mapper.likeUserOne02(str);
        for (UserOne userOne : userOnes) {
            System.out.println(userOne);
        }
        session.close();
    }














}
