package com.staging.frame.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Created by Li B.
 * @date Created in 2018/6/21.
 */
@RestController
@Slf4j
public class BaseController {

    @GetMapping("/")
    public ModelAndView baseController(){
        return new ModelAndView("index");
    }
}
