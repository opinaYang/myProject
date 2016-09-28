package designPattern.factoryMethod;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("send mails");
	}

}
