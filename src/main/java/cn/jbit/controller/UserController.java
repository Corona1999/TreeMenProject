package cn.jbit.controller;

import cn.jbit.entity.User;
import cn.jbit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by DELL on 2019-10-14.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/d")
    public String d()
    {
        return "index";
    }

    @PostMapping("/delete")
    @ResponseBody
    public String deleteUserById(@RequestParam("id") Integer id)
    {
        if(userService.deleteUserById(id)>0)
            return "success";
        return "loser";
    }

    @RequestMapping("/a")
    public String a()
    {
        return "index";
    }

    @PostMapping("/findAll")
    @ResponseBody
    public List<User> findAll() throws Exception
    {
        List<User> list=userService.findAll();
        System.out.println(list);
        return list;
    }

/*    public List<User> pageShare() throws Exception
    {
        return null;
    }*/

/*    @RequestMapping("/select")
    public List<User> getType()
    {
        List<User> listType=null;
        try {
            listType = userService.selectByUserId();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return listType;
    }*/
}
