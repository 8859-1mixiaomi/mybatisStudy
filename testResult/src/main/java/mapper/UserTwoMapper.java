package mapper;

import entity.UserTwo;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserTwoMapper {

    UserTwo selectUserById(int id);


    List<UserTwo> selectUserTwo();


    List<UserTwo> selectUserTwoLimit(Map<String,Integer>map);


    List<UserTwo> selectUserRowBounds();



}
