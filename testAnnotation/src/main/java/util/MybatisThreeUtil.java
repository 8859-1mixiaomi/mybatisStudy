package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisThreeUtil {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String resource = "MybatisThree-config.xml";
            InputStream stream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }


    public static SqlSession getSqlSession(boolean flag) {
        return sqlSessionFactory.openSession();
    }


}
