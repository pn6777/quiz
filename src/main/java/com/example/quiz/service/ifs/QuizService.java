package com.example.quiz.service.ifs;

import java.time.LocalDate;
import java.util.List;

import com.example.quiz.vo.AnswerReq;
import com.example.quiz.vo.BaseRes;
import com.example.quiz.vo.CreateOrUpDateReq;
import com.example.quiz.vo.SearchRes;
import com.example.quiz.vo.StatisticsRes;

public interface QuizService {

	public BaseRes create(CreateOrUpDateReq req);
	
	public SearchRes search(String quizName, LocalDate startDate, LocalDate endDate, boolean isBackend);
	
	public BaseRes deleteQuiz(List<Integer> quizIds) ;
	
	public BaseRes deleteQuestions(int quizId, List<Integer> quId);
	
	public BaseRes update(CreateOrUpDateReq req);
	
	public BaseRes answer(AnswerReq req);
	
	public StatisticsRes statistics(int quizId);
}
