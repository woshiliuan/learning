package com.liu.servicehi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by anliu on 2017/12/9.
 */
@RestController
public class SayHiController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi " + name + ", i am from port:" + port;
    }
}
