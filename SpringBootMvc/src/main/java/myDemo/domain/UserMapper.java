package myDemo.domain;



import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 2P on 2018/3/15.
 */

@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> selectUserList();
}
