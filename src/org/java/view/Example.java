package org.java.view;

import java.net.URI;

import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Example {

	
	 // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "AC4f1ba5459b50fbdfad48df66a975de09";
    public static final String AUTH_TOKEN = "07b356df4e64b7bd89aa6fdb11a8f438";
	
	public static void main(String[] args) {
		
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		Message message = Message
                .creator(new PhoneNumber("+919990150182"), // to
                        new PhoneNumber("+918077441106"), // from
                        "Where's Wallace?")
                .create();
		System.out.println(message.getSid());
		

	}

}
