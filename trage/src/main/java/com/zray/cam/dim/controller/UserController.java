package com.zray.cam.dim.controller;

import com.zray.cam.dim.domain.User;
import com.zray.cam.dim.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/dim/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "get/{id}")
    @ResponseBody
    public User get(@PathVariable("id") Long id){
        return  userService.getById(id);
    }
}
