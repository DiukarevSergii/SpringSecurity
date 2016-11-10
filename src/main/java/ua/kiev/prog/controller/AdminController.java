package ua.kiev.prog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping
    public String loginPage() {
        return "employee/admin/admin";
    }
}
