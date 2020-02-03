/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pms.web.entity.master;

import com.pms.core.entity.MasterEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Babu TUl
 */
@Entity
@Table(name = "mst_project_status")
public class MasterProjectStatus extends MasterEntity{
    @Column(name="name")
    private String name;
    @Column(name="color")
    private String color;
    @Column(name="created_date",insertable = false,updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(name="modified_date",nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;

    public MasterProjectStatus() {
    }
    public MasterProjectStatus(int id) {
        this.id=id;
    }

    public MasterProjectStatus(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
    
    
}

