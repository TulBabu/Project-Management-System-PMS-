/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pms.core.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author Babu TUl
 */
public abstract class SiteController {
    protected String pageURI,pageTitle,viewPath;
    @ModelAttribute()
    public void globalVariable(Model modal){
        modal.addAttribute("pageURI", pageURI);
        modal.addAttribute("pageTitle",pageTitle);
        modal.addAttribute("viewPath",viewPath);
        
    }
    
}
