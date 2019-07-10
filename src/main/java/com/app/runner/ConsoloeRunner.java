package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.util.MailUtil;

@Component
public class ConsoloeRunner implements CommandLineRunner {

	@Autowired
	private  MailUtil send;
	
	@Override
	public void run(String... args) throws Exception {/*
//		System.out.println("inside the console runnerr");
		FileSystemResource file=new FileSystemResource("C:\\Users\\babuv\\OneDrive\\Desktop\\Photo.jpg");
		
		String[] st=new String[1];
		st[0]="8500812360v@gmail.com";
		
		
		String[] bcc=new String[1];
		bcc[0]="babu.veera010@gmail.com";
	

	
		System.out.println("1st ones list data ----------"+Arrays.asList(st));
		System.out.println("2nd one "+Arrays.asList(bcc));
		
	boolean b=send.send("babu.veer010@gmail.com", "testemail", "success",st, bcc,file);
	
	
	if(b)
		System.out.println("sent");
	else
		System.out.println("failure");
	
	*/}

}
