package mapper;

import entity.Student;
import entity.Teacher;

import java.util.List;

public interface StudentMapper {

    //获取所有学生及对应老师的信息
    List<Student>  getStudent();


    List<Teacher> getTeacher(int eid);



    List<Student> getStudent02();






}
