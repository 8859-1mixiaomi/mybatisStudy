import entity.Student;
import entity.Teacher;
import mapper.StudentMapper;
import mapper.TeacherMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import util.MybatisFourUtil;

import java.util.List;

public class OneToMost {


    @Test
    public void test01() {
        SqlSession sqlSession = MybatisFourUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }

    @Test
    public void test02() {
        SqlSession sqlSession = MybatisFourUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student02 = mapper.getStudent02();
        for (Student student : student02) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void test03() {
        SqlSession sqlSession = MybatisFourUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(100043860);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void test04() {
        SqlSession sqlSession = MybatisFourUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher2 = mapper.getTeacher2(100043860);
        System.out.println(teacher2);
        sqlSession.close();

    }


}
