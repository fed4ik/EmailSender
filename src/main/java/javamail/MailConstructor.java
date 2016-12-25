package javamail;

public class MailConstructor {
	String to = "fed4iksasha@gmail.com";
	String from = "javahomesfk@gmail.com";
	String username = "javahomesfk@gmail.com";
	String password = "JavaHome01";
	String text;

	public MailConstructor() {
		// TODO Auto-generated constructor stub
	}

	public MailConstructor(String to, String from, String username, String password, String text) {
		this.to = to;
		this.from = from;
		this.username = username;
		this.password = password;
		this.text = text;
	}
}
