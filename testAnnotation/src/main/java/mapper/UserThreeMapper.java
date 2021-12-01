package mapper;

import entity.UserThree;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserThreeMapper {

    @Select("select id,name,pwd from user")
    public  List<UserThree> getAllUser();


    @Select("select * from user where id=#{id}")
    public UserThree selectUserById(@Param("id") int id);

    @Insert("insert into user(name,pwd) values(#{name},#{pwd})")
    public int addUserThree(UserThree userThree);


    @Update("update user set name=#{name},pwd=#{pwd} where id=#{id}")
    public int updateUserThree(UserThree userThree);

    @Delete("delete from user where id=#{id}")
    public int deleteUserThree(int id);



}
