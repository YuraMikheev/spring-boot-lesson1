package com.yura.springboot.lesson.service;

import com.yura.springboot.lesson.entity.CompanyEntity;
import com.yura.springboot.lesson.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    private final String greeting;
    private final CompanyRepository companyRepository;

    public GreetingService(CompanyRepository companyRepository,
                           @Value("${app.services.greeting.message}") String greeting) {
        this.companyRepository = companyRepository;
        this.greeting = greeting;
    }

    public String greeting() {
        return greeting;
    }

    public List<CompanyEntity> getAll() {
        return companyRepository.findAll();
    }
}
