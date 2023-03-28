package com.exam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {
  
    @GetMapping("/")
    public String main(Model model) {
      model.addAttribute("student", "Jorge Luis Salgado Ledezma");
      model.addAttribute("studentId", "A01636629");
      return "index";
    }
  
    @GetMapping("/cart")
    public String cart(Model model) {
      model.addAttribute("student", "Jorge Luis Salgado Ledezma");
      model.addAttribute("studentId", "A01636629");
      return "cart";
    }
}
