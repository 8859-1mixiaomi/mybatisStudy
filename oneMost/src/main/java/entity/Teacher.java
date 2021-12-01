package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
private int eId;
private String eName;
private String sex;
private Date  birthday;
private Date  inDate;
private String status;
private String  education;
private String  degree;
private String  title;
private String  did;
private List<Student> student;
}
