package com.gruh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gruh.dao.SocietyMemberData;

@Repository
public interface SocietyMemberRepository extends JpaRepository<SocietyMemberData, Integer> {

}
