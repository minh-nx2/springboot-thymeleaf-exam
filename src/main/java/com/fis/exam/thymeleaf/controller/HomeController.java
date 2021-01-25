package com.fis.exam.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {

        try {
            model.addAttribute("serverAddress", InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return "index";
    }
}
