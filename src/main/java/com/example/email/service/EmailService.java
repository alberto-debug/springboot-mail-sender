package com.example.email.service;

import com.example.email.model.EmailDetails;
import jakarta.el.ELManager;

public interface EmailService {

    String sendSimpleMail(EmailDetails details);

    String sendMailWithAttachment(EmailDetails details);


}
