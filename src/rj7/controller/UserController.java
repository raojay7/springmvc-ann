package rj7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import rj7.vo.User;
import rj7.vo.UserCus;

import java.util.ArrayList;
import java.util.List;

/**
 * 注解开发
 * 需要定义根路径
 * 未了区分方法是属于哪个类的
 * Created by 隽 on 2016/12/16.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("hello")
    public String getHello(){
        return "hello";
    }


    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }

    //接收int类型的数据
    @RequestMapping("receiveInt")
    public String receiveInt(Integer id){
        System.out.println(id);
        return "success";
    }
    //接收string类型的数据
    @RequestMapping("receiveStr")
    public String receiveString(String str){
        System.out.println(str);
        return "success";
    }

    //接收user类型的数据
    @RequestMapping("receiveUser")
    public String receiveUser(User user){
        System.out.println(user);
        return "success";
    }

    //接收包装user类型的数据
    @RequestMapping("receiveUserCus")
    public String receiveCus(UserCus user){
        System.out.println(user.getUser());
        return "success";
    }

    @RequestMapping("receiveArray")
    public String receiveVo(Integer[] ids){
        for (Integer id:ids
             ) {
            System.out.println(id);

        }
        return "success";
    }
    //接收包装user类型的数据
    @RequestMapping("receiveUserCusList")
    public String receiveCusList(UserCus user){
        System.out.println(user.getUsers());
        return "success";
    }
    //接收map类型的数据
    @RequestMapping("receiveUserCusMap")
    public String receiveMap(UserCus user){
        System.out.println(user.getMap().get("username"));
        return "success";
    }

    @RequestMapping("list")
    public String list(Model model){
        //model	相当于application域对象

        List<User> userList = new ArrayList<User>();

        User user1 = new User();

        user1.setId(1);
        user1.setUsername("张山峰");
        user1.setAddress("武当山");

        User user2 = new User();
        user2.setUsername("张山峰222");
        user2.setAddress("武当山222");
        user2.setId(2);

        User user3 = new User();
        user3.setUsername("张山峰333");
        user3.setAddress("武当山333");
        user3.setId(3);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        model.addAttribute("userList", userList);

        return "list";
    }
    @RequestMapping("updateByID/{id}")
    public String updateByID(@PathVariable Integer id, Model model){
        User user1 = new User();
        user1.setId(id);
        user1.setUsername("张山峰");
        user1.setAddress("武当山");

        model.addAttribute("user", user1);

        return "edit";
    }


}
