package com.example.quiz.vo;

import java.util.List;

import com.example.quiz.entity.Quiz;

public class SearchRes extends BaseRes {

	List<Quiz> quizList;

	public SearchRes() {
		super();
	}

	public SearchRes(int code, String messagr) {
		super(code, messagr);
	}
	
	public SearchRes(int code, String messagr,List<Quiz> quizList) {
		super(code, messagr);
		this.quizList = quizList;
	}
	
	public List<Quiz> getQuizList() {
		return quizList;
	}

	public void setQuizList(List<Quiz> quizList) {
		this.quizList = quizList;
	}

	
}
