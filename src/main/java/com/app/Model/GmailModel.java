package com.app.Model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class GmailModel {
	
	private String to;
	private String sub;
	private String[] cc;
	private String[] bcc;
	private String text;
	private MultipartFile file;
	

}
