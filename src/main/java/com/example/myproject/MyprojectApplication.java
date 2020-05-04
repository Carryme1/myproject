package com.example.myproject;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@MapperScan("com.example.myproject.dao")
public class MyprojectApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyprojectApplication.class, args);
	}

}
