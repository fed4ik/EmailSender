package model;

public class ModelOfMail {
	String to = "fed4iksasha@gmail.com";
	String from = "kochedikov.ilia@gmail.com";
	String username = "kochedikov.ilia@gmail.com";
	String password = "Ko4ed9871iko";
	String text;

	public ModelOfMail() {

	}

	public ModelOfMail(String to, String from, String username, String password, String text) {
		this.to = to;
		this.from = from;
		this.username = username;
		this.password = password;
		this.text = text;
	}
}
