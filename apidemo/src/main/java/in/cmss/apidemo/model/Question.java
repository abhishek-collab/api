package in.cmss.apidemo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "Question")


public class Question {
    public Question(int id, String questionTitle1, String questionTitle2, String questionTitle3) {
		super();
		this.id = id;
		this.questionTitle1 = questionTitle1;
		this.questionTitle2 = questionTitle2;
		this.questionTitle3 = questionTitle3;
	}
	@Id	
	private int id;
	private String questionTitle1;
	private String questionTitle2;
	private String questionTitle3;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestionTitle1() {
		return questionTitle1;
	}
	public void setQuestionTitle1(String questionTitle1) {
		this.questionTitle1 = questionTitle1;
	}
	public String getQuestionTitle2() {
		return questionTitle2;
	}
	public void setQuestionTitle2(String questionTitle2) {
		this.questionTitle2 = questionTitle2;
	}
	public String getQuestionTitle3() {
		return questionTitle3;
	}
	public void setQuestionTitle3(String questionTitle3) {
		this.questionTitle3 = questionTitle3;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", questionTitle1=" + questionTitle1 + ", questionTitle2=" + questionTitle2
				+ ", questionTitle3=" + questionTitle3 + "]";
	}
	
	}

	
	


