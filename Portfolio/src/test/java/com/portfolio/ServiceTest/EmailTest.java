package com.portfolio.ServiceTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.portfolio.Entity.Enquiry;
import com.portfolio.Service.EmailService;
import com.portfolio.Service.Enquiryservice;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.transaction.Transactional;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@Transactional
public class EmailTest {
//	@BeforeAll
//	public static void setup() {
//	    Dotenv dotenv = Dotenv.configure().directory("src/main/resources").filename("chane2.env").load();
//	    System.setProperty("DB_HOST", dotenv.get("DB_HOST"));
//	    System.setProperty("DB_PORT", dotenv.get("DB_PORT"));
//	    System.setProperty("DB_NAME", dotenv.get("DB_NAME"));
//	    System.setProperty("DB_USER", dotenv.get("DB_USER"));
//	    System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
//	    System.setProperty("MAIL_HOST", dotenv.get("MAIL_HOST"));
//	    System.setProperty("MAIL_PORT", dotenv.get("MAIL_PORT"));
//	    System.setProperty("MAIL_USERNAME", dotenv.get("MAIL_USERNAME"));
//	    System.setProperty("MAIL_PASSWORD", dotenv.get("MAIL_PASSWORD"));
//
//	}


    @Autowired
    public Enquiryservice service2;

    @Autowired
    public EmailService service;

    @Test
    public void sendmailtest() throws Exception {
        Enquiry enq = new Enquiry();
        enq.setEmail("maheshgavale05178@gmail.com");
        enq.setMobilenumber("7774834341");
        enq.setName("mahesh gavale");
        enq.setSubject("Regarding Job as Java Trainer");

        Enquiry enq2 = service2.addenquiry(enq);

        Assertions.assertThat(enq.getName()).isEqualTo(enq2.getName());
    }

    @Test
    public void null_object_must_throw_an_exception() {
        Enquiry enq = new Enquiry();

        assertThrows(Exception.class, () -> {
            service2.addenquiry(enq);
        });
    }
}
