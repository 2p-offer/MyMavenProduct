package myDemo.web;

import myDemo.UserService.UserService;
import myDemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 2P on 2018/3/15.
 */

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findall")
    public List<User> findAllUser(){
        System.out.println("进入controller");
        return  userService.findAllUser();

    }

//    @RequestMapping("/error")
//    public String error(){
//        return "erroraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
//    }
}
