package rj7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 注解开发
 * Created by 隽 on 2016/12/16.
 */
@Controller
public class UserController {

    @RequestMapping("hello")
    public String getHello(){
        return "hello";
    }


}
