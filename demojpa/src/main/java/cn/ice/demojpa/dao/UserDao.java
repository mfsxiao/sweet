package cn.ice.demojpa.dao;

import cn.ice.demojpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao  extends JpaRepository<User,Integer> {

}
