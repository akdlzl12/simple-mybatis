package com.sample.todo.service;

import java.util.List;

import com.sample.todo.vo.Todo;

public interface TodoService {

	public List<Todo> getAllSeletes();
	public void insertInfomation(Todo todo);
	public void deleteInfomation(int no);
}
