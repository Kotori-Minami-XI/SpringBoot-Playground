package com.Kotori.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String Login() {
        return "/login";
    }

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public String userLogin(String username, String password, Model model, HttpSession session) {
        if ("1234".equals(password) && "1".equals(username)) {
            session.setAttribute("user",username);
            return "redirect:main";
        } else {
            model.addAttribute("login_msg","登陆失败");
            return "/login";
        }
    }
}
