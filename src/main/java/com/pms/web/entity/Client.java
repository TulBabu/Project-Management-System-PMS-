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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Babu TUl
 */
@Entity
@Table(name = "tbl_clients")
public class Client extends MasterEntity{
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="contact_no")
    private String contactNo;
    @Column(name="website")
    private String website;
    @Column(name="address")
    private String address;
    @Column(name="created_date",insertable = false,updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(name="modified_date",nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;
    @Column(name="status")
    private boolean status;

    public Client() {
    }
    public Client(int id) {
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
