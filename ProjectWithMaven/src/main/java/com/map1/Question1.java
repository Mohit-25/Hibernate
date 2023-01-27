package com.map1;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class Question1 {
    @Id
    @Column(name="question_id")
	private int questionId;
	private String question;
	@OneToMany(mappedBy="question", fetch= FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Answers> answer;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answers> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answers> answer) {
		this.answer = answer;
	}
	public Question1(int questionId, String question, List<Answers> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}
	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

