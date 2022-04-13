package com.exam.controller;

import com.exam.model.Result;
import com.exam.repo.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/result")
@CrossOrigin("*")
public class ResultController {

    @Autowired
    ResultRepository resultRepository;

    @GetMapping("/all")
    public List<Result> getAllResult(){
        return resultRepository.findAll();
    }
}
