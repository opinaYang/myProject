package designPattern.factoryMethod;

public class SenderFactory {

	/**
	 * 普通工厂模式方法
	 * 
	 * @param type
	 * @return
	 */
	public Sender produce(String type) {
		if (type.equals("sms")) {
			return new SmsSender();
		} else if (type.equals("mail")) {
			return new MailSender();
		} else {
			System.out.println("类型对比不上");
		}
		return null;
	}

	/**
	 * 多个工厂方法模式
	 * 
	 * @return
	 */
	public Sender produceSms() {
		return new SmsSender();
	}

	public Sender produceMail() {
		return new MailSender();
	}

	/**
	 * 静态工厂方法模式
	 * 
	 * @return
	 */
	public static Sender produceSmsS() {
		return new SmsSender();
	}

	public static Sender prouceMailS() {
		return new MailSender();
	}

	public static void main(String[] args) {

		SenderFactory sf = new SenderFactory();
		// 普通工厂模式调用
		Sender smsSender = sf.produce("sms");
		smsSender.send();

		// 多个工厂方法模式调用
		Sender mailSender = sf.produceMail();
		mailSender.send();

		// 静态工厂方法模式调用
		Sender smsSender2 = SenderFactory.produceSmsS();
		smsSender2.send();

	}
}
