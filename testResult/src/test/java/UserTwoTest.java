import entity.UserTwo;
import mapper.UserTwoMapper;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import util.MybatisTwoUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserTwoTest {

    //注意导包：org.apache.log4j.Logger
    static Logger logger = Logger.getLogger(UserTwoTest.class);

    @Test
    public void testUser01() {
        SqlSession sqlSession = MybatisTwoUtil.getSqlSession();
        UserTwoMapper mapper = sqlSession.getMapper(UserTwoMapper.class);
        UserTwo userTwo1 = mapper.selectUserById(11);
        System.out.println(userTwo1);
        sqlSession.close();
    }

    @Test
    public void testUser02() {
        SqlSession sqlSession = MybatisTwoUtil.getSqlSession();
        UserTwoMapper mapper = sqlSession.getMapper(UserTwoMapper.class);
        List<UserTwo> userTwos = mapper.selectUserTwo();
        for (UserTwo userTwo : userTwos) {
            System.out.println(userTwo);
        }
        sqlSession.close();
    }

    @Test
    public void testUser03() {
        SqlSession sqlSession = MybatisTwoUtil.getSqlSession();
        UserTwoMapper mapper = sqlSession.getMapper(UserTwoMapper.class);
        int currentPage = 2;//第几页
        int pageSize = 5;// 每页显示几个
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", (currentPage - 1) * pageSize);
        map.put("pageSize", pageSize);
        List<UserTwo> userTwos = mapper.selectUserTwoLimit(map);
        for (UserTwo userTwo : userTwos) {
            System.out.println(userTwo);
        }
        sqlSession.close();

    }

    @Test
    public void testUser04() {
        SqlSession sqlSession = MybatisTwoUtil.getSqlSession();
        int currentPage = 1;
        int pageSize = 3;
        RowBounds rowBounds = new RowBounds((currentPage - 1) * pageSize, pageSize);
        //通过session.**方法进行传递rowBounds，[此种方式现在已经不推荐使用了]
        List<UserTwo> objects = sqlSession.selectList("mapper.UserTwoMapper.selectUserRowBounds", null, rowBounds);
        for (UserTwo object : objects) {
            System.out.println(object);
        }
        sqlSession.close();
    }


}
