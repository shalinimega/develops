package com.StudentMarkSheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentMarkSheet.entity.MarkSheet;

public interface MarkSheetRepository extends JpaRepository<MarkSheet, Integer> {

}
