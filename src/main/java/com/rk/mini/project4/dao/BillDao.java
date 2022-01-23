package com.rk.mini.project4.dao;

import com.rk.mini.project4.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillDao extends JpaRepository<Bill, Integer> {
    @Query(value = "SELECT t from Bill t"/* limit 10",nativeQuery = true*/)
    List<Bill> allData();
}
