package MailDbPackage;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import MailDbPackage.TestConfig;

public class TestMail {

	public static void main(String[] args) throws Throwable, Exception {
		
		MonitoringMail mail = new MonitoringMail();
		
		mail.sendMail(TestConfig.server,TestConfig.from,TestConfig.to,TestConfig.subject,TestConfig.messageBody);

	}

}
