package mapper;

import entity.Student;
import entity.Teacher;

import java.util.ArrayList;
import java.util.List;

public interface TeacherMapper {

   Teacher getTeacher(Integer eId);


    public Teacher  getTeacher2(Integer eId);


    List<Student> getStudentByTeacherId(int sid);

}
