package com.poly.controller.auth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String form() {
        return "auth/login";
    }

    @RequestMapping("/login/success")
    public String success(Model model) {
        model.addAttribute("message", "Đăng nhập thành công!");
        return "forward:/home/about";
    }

    @RequestMapping("/login/error")
    public String error(Model model) {
        model.addAttribute("message", "Sai thông tin đăng nhập!");
        return "forward:/login";
    }

    @RequestMapping("/logoff/success")
    public String logoff(Model model) {
        model.addAttribute("message", "Đăng xuất thành công!");
        return "forward:/login";
    }

    @RequestMapping("/access/denied")
    public String denied(Model model) {
        model.addAttribute("message", "Không đủ quyền truy cập!");
        return "auth/login";
    }
}
