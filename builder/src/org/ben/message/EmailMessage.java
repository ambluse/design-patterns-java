package org.ben.message;

public abstract class EmailMessage {

	private String to;
	
	private String from;
	
	private String title;
	
	private String body;
	
	
	public void send() {
		System.out.println(toString());
	}


	@Override
	public String toString() {
		return "EmailMessage [to=" + to + ", from=" + from + ", title=" + title + ", body=" + body + "]";
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}
	
	
}
