package com.hongjun.mapper;

import com.hongjun.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author hongjun500
 * @date 2020/6/9 21:17
 * Created with 2019.3.2.IntelliJ IDEA
 * Description:
 */
@Mapper
public interface UserMapper {
    User getUser(Integer id);


    @Select("select * from user")
    List<User> findUser();

    @Insert("insert into user(last_name, gender) value(#{lastName}, #{gender})")
    int saveUser(String lastName, boolean gender);
}
