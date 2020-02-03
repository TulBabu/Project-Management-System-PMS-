/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pms.web.controller;

import com.pms.core.controller.CRUDController;
import com.pms.web.entity.Employee;
import com.pms.web.entity.Project;
import com.pms.web.repository.ClientRepository;
import com.pms.web.repository.ProjectEmployeeRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Babu TUl
 */
@Controller
@RequestMapping(value = "/projects")
public class ProjectController extends CRUDController<Project, Integer>{
    @Autowired
    private ProjectEmployeeRepository projectEmpRepository;
    public ProjectController() {
        pageTitle="Project";
        pageURI="projects";
        viewPath="projects";
    }
    //for display individula  employee of endividual project at a json
    @GetMapping(value="/employees/{projectId}")
    @ResponseBody
    public List<Employee>getProjectEmployeeJson(
    @PathVariable("projectId")int projectId){
        Project project=repository.findById(projectId).get();
        return project.getEmployees();
    }
   @PostMapping(value = "/remove-employee")
   @Transactional
   @ResponseBody
   public String removeEmployee(@RequestParam("projectId")int projectId,
           @RequestParam("employeeId")int employeeId){
//       Project project=repository.findById(projectId).get();
//       String message="";
//       for(Employee emp:project.getEmployees()){
//           if(emp.getId()==employeeId){
//               message="Employee found";
//               //for add emplyee we can use same this process remove repalced by add
//               //From this remove only from memory
//               project.getEmployees().remove(emp);
//           }
//       }
//       //for add emplyee we can use same this process
//       //Remove From Database
//       repository.save(project);


    projectEmpRepository
            .deleteByProjectIdAndEmployeeId(projectId, employeeId);

       return "project:" + projectId +",employeeId:"+
               employeeId;
   }
    
}
