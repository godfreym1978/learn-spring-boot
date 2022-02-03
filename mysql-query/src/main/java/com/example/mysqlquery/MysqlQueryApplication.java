package com.example.mysqlquery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MysqlQueryApplication  extends SpringBootServletInitializer{

	  @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(MysqlQueryApplication.class);
	  }

	  public static void main(String[] args) {
	    SpringApplication.run(MysqlQueryApplication.class, args);
	  }
}
