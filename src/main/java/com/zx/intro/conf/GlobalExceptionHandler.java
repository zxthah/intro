package com.zx.intro.conf;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public String errorHandler(Model model, Exception e) {
        model.addAttribute("error", e.getMessage());
        //到模板找到err.ftl将错误信息显示出来
        return "err";
    }
}
