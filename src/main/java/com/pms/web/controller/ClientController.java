/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pms.web.controller;

import com.pms.core.controller.CRUDController;
import com.pms.web.entity.Client;
import com.pms.web.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Babu TUl
 */
@Controller
@RequestMapping(value = "/clients")
public class ClientController extends CRUDController<Client, Integer>{
    public ClientController() {
        pageTitle="Client";
        pageURI="clients";
        viewPath="clients";
    }
    
}
