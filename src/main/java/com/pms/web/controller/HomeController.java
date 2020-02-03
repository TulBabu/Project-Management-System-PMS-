/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pms.web.controller;

import com.pms.core.controller.SiteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Babu TUl
 */
@Controller
@RequestMapping(value = "/")
public class HomeController extends SiteController{

    public HomeController() {
    pageTitle="Dashboard";
    }
    @GetMapping
    public String index(){
        return "home/index";
    }
    @GetMapping(value = "/about")
    public String about(){
        return "home/index";
    }
    
}
