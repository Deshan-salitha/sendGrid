package com.mailing.sendGrip.Controller;


import java.io.IOException;

import com.mailing.sendGrip.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.hamdibouallegue.sendgriddemo.model.InvitationEmail;
//import com.hamdibouallegue.sendgriddemo.service.MailService;

//@RestController
//@RequestMapping(value = "/api")
public class MailController {
    @Autowired
    MailService mailService;

    @PostMapping("/send-text")
    public String send() throws IOException {
        return mailService.sendTextEmail();
    }
}
