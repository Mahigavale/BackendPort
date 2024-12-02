package com.portfolio.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {
	
	    @Autowired
	    private JavaMailSender sender;

	    public void sendHtmlEmail(String to, String recipientName) throws MessagingException {
	        MimeMessage message = sender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(message, true);

	        String subject = "Thank you for reaching out!";
	        String body = String.format("""
	                <html>
	                <body>
	                    <p>Dear <span style="color:green"><b> %s,</b> </span></p>
	                    <p>Thank you for reaching out! </p>
	                    <p>I have received your enquiry and will get back to you as soon as possible.</p>
	                    <br>
	                    <p>Best regards,</p>
	                    <p>Mahesh Gavale</p>
	                    <hr>
	                    <p style="font-size:12px;color:gray;">
	                        Contact:+91 7774834341<br>
	                        Email: <a href="mailto:Maheshgavale07@gmail.com">Maheshgavale07@gmail.com</a>
	                    </p>
	                </body>
	                </html>
	                """, recipientName);

	        helper.setTo(to);
	        helper.setSubject(subject);
	        helper.setText(body, true); // Set `true` to enable HTML content

	        sender.send(message);
	    }
	}



