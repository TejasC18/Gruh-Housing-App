package com.gruh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gruh.dao.UserData;

@Repository
public interface UserRepository extends JpaRepository<UserData, Integer> {

}
