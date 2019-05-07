package com.zy.controller;

import com.zy.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@Api(value = "v1",description = "这是我第一个版本的demo")
@RequestMapping("v1")
public class Demo {

    //首先获取一个执行sql语句的语句

    @Autowired
    private SqlSessionTemplate template;
    @RequestMapping(value = "/getUserList",method = RequestMethod.GET)
    @ApiOperation(value = "可以获取到用户数",httpMethod = "GET")
    //调用sql语句
    public int getUserList(){
        return template.selectOne("getUserCount");
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public int addUser(@RequestBody User user){
        int result = template.insert("addUser",user);
        return result;
    }
    @RequestMapping(value = "/updataUser",method = RequestMethod.POST)
    public int updateUser(@RequestBody User user){
        return template.update("updateUser",user);
    }
    @RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
    public int delUser(@RequestParam int id){
       return template.delete("deleteUser",id);
    }


}
