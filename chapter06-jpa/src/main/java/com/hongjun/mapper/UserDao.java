package com.hongjun.mapper;

import com.hongjun.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hongjun500
 * @date 2020/6/8 21:59
 * Created with 2019.3.2.IntelliJ IDEA
 * Description:
 */

public interface UserDao extends JpaRepository<User, Long> {
    User findUsersByGender();
    User findUserById(Long id);
}
