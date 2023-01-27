package com.map1;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Answers {
	@Id
	@Column(name="answer_id")
	private int answerId;
	private String answer;
	@ManyToOne
	@JoinColumn(name="q_id")
	private Question1 question;
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question1 getQuestion() {
		return question;
	}
	public void setQuestion(Question1 question) {
		this.question = question;
	}
	public Answers(int answerId, String answer, Question1 question) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.question = question;
	}
	public Answers() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
