package mapper;

import entity.UserOne;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserOneMapper {

    List<UserOne> selectUserOne();


    UserOne selectUserById(int id);

    UserOne selectUserByNP(@Param("username") String username,@Param("pwd") String pwd);


    UserOne selectUserByNP02(Map<String,Object> map);


    int addUserOne(UserOne userOne);


    int updateUserOne(UserOne userOne);


    int deleteUserOne(UserOne userOne);


    List<UserOne> likeUserOne01(String str);


    List<UserOne> likeUserOne02(String str);

}
