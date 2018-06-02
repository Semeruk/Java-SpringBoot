package com.vsemeruk.springboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @RequestMapping("/status-app")
    public String getAppStatus() {
        return "Status: OK";
    }
}
