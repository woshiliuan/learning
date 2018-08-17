package com.liu.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by anliu on 2017/12/10.
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
