/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pms.web.entity;

import com.pms.core.entity.MasterEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Babu TUl
 */
@Entity
@Table(name = "tbl_project_employees")
public class ProjectEmployee extends MasterEntity{
    @JoinColumn(name = "project_id",referencedColumnName = "id")
    @ManyToOne
    private Project project;
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    @ManyToOne
    private Employee employee;
    @Column(name = "assign_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date assignDate;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }
    
    
}

