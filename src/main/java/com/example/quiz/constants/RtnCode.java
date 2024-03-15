package com.example.quiz.constants;

public enum RtnCode {

	SUCCESS(200, "Success!?"), //
	PARAM_ERROR(400, "Param error!?"),//
	QUIZ_EXISTS(400, "Quiz exists!?"),//
	QUIZ_NOT_FOUND(400, "Quiz not found!?"),//
	DUPLICATED_QUESTION_ID(400, "Duplcated question id!?"),//
	TIME_FORMAT_ERROR(400, "Time format error!?"),//
	QUIZ_ID_ERROR(400, "Quiz id error!?"),//
	QUSTION_NO_ANSWER(400 , "Qustion bo answer!?"),//
	DUPLICATED_QUIZ_ANSWER(400, "Duplicated quiz answer!?"),//
	QUIZ_ID_DOES_NOT_MATCH(400,"Quiz id does not match!?");

	private int code;

	private String messagr;

	private RtnCode(int code, String messagr) {
		this.code = code;
		this.messagr = messagr;
	}

	public int getCode() {
		return code;
	}

	public String getMessagr() {
		return messagr;
	}

}
