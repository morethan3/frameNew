package com.staging.frame.web.controller;

import com.staging.frame.web.service.EvaluationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private EvaluationService evaluationService;

    @GetMapping("/")
    public ModelAndView baseController() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("currentPage","index");
        return modelAndView;
    }

    @GetMapping("/lifetime")
    public ModelAndView jumpToLifeTimePage() {
        ModelAndView modelAndView =new ModelAndView("shengping");
        modelAndView.addObject("currentPage","lifetime");
        return modelAndView;
    }

    @GetMapping("/measure")
    public ModelAndView jumpToMeasurePage() {
        ModelAndView modelAndView =new ModelAndView("jucuo");
        modelAndView.addObject("currentPage","measure");
        return modelAndView;
    }

    @GetMapping("/achievement")
    public ModelAndView jumpToAchievementPage() {
        ModelAndView modelAndView =new ModelAndView("chengjiu");
        modelAndView.addObject("currentPage","achievement");
        return modelAndView;
    }

    @GetMapping("/relative")
    public ModelAndView jumpToRelativePage() {
        ModelAndView modelAndView =new ModelAndView("qinshu");
        modelAndView.addObject("currentPage","relative");
        return modelAndView;
    }

    @GetMapping("/evaluation")
    public ModelAndView jumpToEvaluationPage() {
        ModelAndView modelAndView =new ModelAndView("pingjia");
        modelAndView.addObject("currentPage","evaluation");
        log.info(evaluationService.getAllEvaluations().toString());
        return modelAndView;
    }

    @GetMapping("/allusion")
    public ModelAndView jumpToAllusionPage() {
        ModelAndView modelAndView =new ModelAndView("diangu");
        modelAndView.addObject("currentPage","allusion");
        return modelAndView;
    }

    @GetMapping("/economics")
    public ModelAndView jumpToEconomicsPage() {
        return new ModelAndView("jingji");
    }

    @GetMapping("/military")
    public ModelAndView jumpToMilitaryPage() {
        return new ModelAndView("junshi");
    }

    @GetMapping("/culture")
    public ModelAndView jumpToCulturePage() {
        return new ModelAndView("wenhua");
    }

    @GetMapping("/calligraphy")
    public ModelAndView jumpToCalligraphyPage() {
        return new ModelAndView("shufa");
    }

}
