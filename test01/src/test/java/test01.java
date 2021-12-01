import entity.User;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import util.MybatisUtils;

import java.util.List;

public class test01 {


    @Test
    public void test01(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
        session.close();
    }




}
