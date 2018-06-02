package myDemo.Test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 2P on 2018/3/15.
 */
@SpringBootApplication
@MapperScan("myDemo.domain")
@ComponentScan("myDemo")
public class MyDemo {


//    @RequestMapping("test")
//    @ResponseBody
//    public String mytest(){
//        return "HELLO";
//
//    }
    public static void  main(String[] args){
        SpringApplication.run(MyDemo.class,args);
    }

}
