package com.nzy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nzy.mapper")//扫描mapper
public class MySpringBootApp {

	public static void main(String[] args) {
		
		SpringApplication.run(MySpringBootApp.class, args);
	}

}
