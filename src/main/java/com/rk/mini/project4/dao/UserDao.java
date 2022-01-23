package com.rk.mini.project4.dao;

import com.rk.mini.project4.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<Users, Integer> {

}
