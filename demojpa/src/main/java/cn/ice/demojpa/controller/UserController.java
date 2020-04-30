package cn.ice.demojpa.controller;

import cn.ice.demojpa.dao.UserDao;
import cn.ice.demojpa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;
    @GetMapping("/save")
    @ResponseBody
    public void addUser(){
        User user=new User("cdcd","121212");
         userDao.save(user);
    }

    @GetMapping("/get")
    @ResponseBody
    public User getuser(){
     User user =  userDao.findById(2).get();
     return user;
    }
}
