package com.example.email.service;

import com.example.email.model.EmailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String sender;


    @Override
    public String sendSimpleMail(EmailDetails details) {
        return "";
    }

    @Override
    public String sendMailWithAttachment(EmailDetails details) {
        return "";
    }
}
