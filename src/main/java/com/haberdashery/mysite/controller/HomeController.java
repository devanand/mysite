/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haberdashery.mysite.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author anand
 */
@Controller
public class HomeController
{
    @RequestMapping("/")
    public ModelAndView home(HttpServletRequest request, HttpServletResponse response)
    {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("name", "dev");
        return mav;
    }
}
