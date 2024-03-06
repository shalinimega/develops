package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.entity.College;

public interface CollegeRepository extends JpaRepository<College,Integer>{

}
