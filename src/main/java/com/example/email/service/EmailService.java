package com.example.email.service;

import com.example.email.model.EmailDetail;
import jakarta.el.ELManager;

public interface EmailService {

    String sendSimpleMail(EmailDetail detail);

    String sendMailWithAttachment(EmailDetail detail)


}
