package com.mailing.sendGrip;

import com.sparkpost.Client;
import com.sparkpost.exception.SparkPostException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SendGripApplication {

	public static void main(String[] args) throws SparkPostException {
		SpringApplication.run(SendGripApplication.class, args);
		String API_KEY = "9b0bc4dc7f4994f8dbceba27a0ad86060e195c1c";
		Client client = new Client(API_KEY);

		client.sendMessage(
				"deshanw@mexxar.com",
				"hcker218@gmail.com",
				"The subject of the message",
				"The text part of the email",
				"<b>The HTML part of the email</b>");
	}

}
