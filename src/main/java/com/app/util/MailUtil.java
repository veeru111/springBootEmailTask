package com.app.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.multipart.MultipartFile;

@Configuration
public class MailUtil {
	@Autowired
	private JavaMailSender sendMail;
	
public boolean send(String to,String sub,String text,String[] cc,String[] bcc,
		MultipartFile file ) {
	
	boolean flag=false;
	
		try {
	
			//Creating the mime message
			MimeMessage message=sendMail.createMimeMessage();
			
			
			//Message Helper class object
	
			MimeMessageHelper helper= new MimeMessageHelper(message,file!=null?true:false);
			
			helper.setTo(to);
			helper.setText(text);
			helper.setSubject(sub);
			helper.setFrom("veeru1234.developer@gmail.com");
			helper.setCc(cc);
			helper.setBcc(bcc);
			
			if(file!=null)
				helper.addAttachment(file.getOriginalFilename(), file);
			
			
				
			sendMail.send(message);
			
			flag=true;
		}
	catch (Exception e) {

		flag=false;
		e.printStackTrace();
	}
	
	
	return flag;
	
}
	
	

}
