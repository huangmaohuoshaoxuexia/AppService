package com.jxf.appservice.action;

import com.jxf.appservice.bean.FestFulBean;
import com.jxf.appservice.bean.UserBean;
import com.jxf.appservice.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ywl on 2017-10-2.
 */
@Controller
@RequestMapping("/user")
public class UserAction {

    @ResponseBody
    @RequestMapping(value = "/loginByPwd.do", method = RequestMethod.GET)
    public FestFulBean loginByPwd(@RequestParam String username, @RequestParam String password) {
        FestFulBean<String> restful = new FestFulBean<String>();
        restful.setData("hello, " + username + " welcom to my website!");
        restful.setStatus(0);
        restful.setMsg("成功");
        return restful;
    }

    @Autowired
    private UserServiceImpl userService;

    /**
     * 根据id查询用户信息 * * @param id * @return
     */
//    @ResponseBody
//    @RequestMapping(value = "/selectDate.do", method = RequestMethod.GET)
//    public UserBean selectDate(@RequestParam("id") int id) {
//
//        UserBean user = userService.getUserById(id);
//        System.out.println("------------request----------id:" + id+"name="+user.getAge());
//        FestFulBean<String> restful = new FestFulBean<String>();
//        restful.setData("hello, " + user.getUsername() + " welcom to my website!");
//        restful.setStatus(0);
//        restful.setMsg("成功");
//        return user;
//    }
    @ResponseBody
    @RequestMapping(value = "/selectDate.json", method ={RequestMethod.POST} )
    public FestFulBean selectDate(@RequestBody  UserBean userBean) {
        UserBean user = userService.getUserById(userBean.getId());
        System.out.println("------------request----------id:" + userBean.getId()+"name="+user.getAge());
        FestFulBean<String> restful = new FestFulBean<String>();
        restful.setData("hello, " + user.getUsername() + " welcom to my website!");
        restful.setStatus(0);
        restful.setMsg("成功");
        return restful;
    }

}
