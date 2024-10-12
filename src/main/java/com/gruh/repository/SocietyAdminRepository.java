package com.gruh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gruh.dao.SocietyAdmin;

@Repository
public interface SocietyAdminRepository extends JpaRepository<SocietyAdmin, Integer> {

}
