package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.bean.Pensioner;

public interface PensionserRepo extends JpaRepository<Pensioner, Long>{

}
