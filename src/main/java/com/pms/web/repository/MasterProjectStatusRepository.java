/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pms.web.repository;

import com.pms.web.entity.master.MasterProjectStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Babu TUl
 */
//JpaRepository ko lagi repository nalekhe pani hunxa
@Repository
public interface MasterProjectStatusRepository extends
        JpaRepository<MasterProjectStatus, Integer>{
    
}
