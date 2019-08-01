package ${package}.controller;

import com.google.common.base.Joiner;
import ${package}.dao.UserDao;
import ${package}.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/users")
    @ResponseBody
    public String test(){
        List<User> users = userDao.getList();
        if (null == users || users.isEmpty()){
            return "No user.";
        }

        return Joiner.on(",").join(users);
    }

    @GetMapping("/user")
    @ResponseBody
    public String getById(String id){
        return "" + userDao.getById(id);
    }

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
}
