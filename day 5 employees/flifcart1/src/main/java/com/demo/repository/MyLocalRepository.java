package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bean.Employee;
@Repository

public interface MyLocalRepository extends JpaRepository< Employee, Long> {

	List<Employee> findAll();

}
