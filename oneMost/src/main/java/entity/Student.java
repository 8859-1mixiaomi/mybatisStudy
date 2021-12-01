package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int sid;
    private String sName;
    private int age;
    private String sex;
    private Date birthday;
    private String address;
    private String phone;
    private String did;
    private String cid;
    private Teacher teacher;
}
