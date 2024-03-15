package com.example.quiz.vo;

import java.util.Map;

public class StatisticsRes extends BaseRes {

	private Map<Integer, Map<String, Integer>> result;

	public StatisticsRes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StatisticsRes(int code, String messagr) {
		super(code, messagr);
	}

	public StatisticsRes(int code,String messagr,Map<Integer, Map<String, Integer>> result) {
		super(code, messagr);
		this.result = result;
	}

	public Map<Integer, Map<String, Integer>> getResult() {
		return result;
	}

	public void setResult(Map<Integer, Map<String, Integer>> result) {
		this.result = result;
	}

}
