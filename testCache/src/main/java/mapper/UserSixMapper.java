package mapper;

import entity.UserSix;

import java.util.Map;

public interface UserSixMapper {

    //根据id查询用户
    UserSix queryUserById(int id);


    int updateUser(Map map);

}
