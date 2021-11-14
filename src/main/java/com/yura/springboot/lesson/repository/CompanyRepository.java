package com.yura.springboot.lesson.repository;

import com.yura.springboot.lesson.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer> {
}
