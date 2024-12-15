package com.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: UserController
 * Package: com.boot.controllers
 * Description:
 *
 */
@Controller
public class UserController {
    @GetMapping("/user")
    @ResponseBody
    public String user() {
        return "hello world!"; // "hello world!"
    }
}
