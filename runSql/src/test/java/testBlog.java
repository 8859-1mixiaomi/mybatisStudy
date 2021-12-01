import entity.Blog;
import lombok.val;
import mapper.BlogMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import util.IDUtil;
import util.MybatisFiveUtil;

import javax.annotation.Resources;
import java.util.*;

public class testBlog {


    @Test
    public void test01() {
        SqlSession sqlSession = MybatisFiveUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtil.getId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBlog(blog);

        blog.setId(IDUtil.getId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtil.getId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtil.getId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void test02() {
        SqlSession sqlSession = MybatisFiveUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, String> map = new HashMap<String, String>();
        map.put("title", "mybatis如此简单");
        map.put("author", "狂神说");
        List<Blog> blogs = mapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }


    @Test
    public void test03() {
        SqlSession sqlSession = MybatisFiveUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, String> map = new HashMap<String, String>();
        map.put("title", "动态sql");
        map.put("author", "小无");
        map.put("sid", "1");
        int i = mapper.updateBlog(map);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void test04() {
        SqlSession sqlSession = MybatisFiveUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", "java如此简单");
        map.put("author", "小无");
        map.put("views", 9999);
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();

    }

    @Test
    public void test05() {
        SqlSession sqlSession = MybatisFiveUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap<>();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        map.put("sid", ids);
        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }


}
