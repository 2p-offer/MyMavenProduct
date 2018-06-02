package myDemo.UserService;

import myDemo.domain.User;
import myDemo.domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 2P on 2018/3/15.
 */

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findAllUser(){
        int a=0;
        String b="";
        return userMapper.selectUserList();
    }

}
