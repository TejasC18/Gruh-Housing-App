package com.gruh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gruh.dao.GruhAdmins;

@Repository
public interface AdminRepository extends JpaRepository<GruhAdmins,Integer> {

}
