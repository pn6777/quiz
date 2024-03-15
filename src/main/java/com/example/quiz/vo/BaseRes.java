package com.example.quiz.vo;

public class BaseRes {

	private int code;

	private String messagr;

	public BaseRes() {
		super();
	}

	public BaseRes(int code, String messagr) {
		super();
		this.code = code;
		this.messagr = messagr;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessagr() {
		return messagr;
	}

	public void setMessagr(String messagr) {
		this.messagr = messagr;
	}

}
