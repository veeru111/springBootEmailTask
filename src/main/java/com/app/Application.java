package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		StopWatch st=new StopWatch();
		st.start();
		System.out.println("application started right nows");
		
		SpringApplication.run(Application.class, args);
		st.stop();
		System.out.println("total time for responce from the soruce------------------"+st.getTotalTimeMillis());
	}

}
