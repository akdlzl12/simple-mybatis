package com.sample.todo.mappers;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sample.todo.vo.Todo;

@Component
public interface TodoMapper {

	public List<Todo> getAllSeletes();
	public void insertInfomation(Todo todo);
	public void deleteInfomation(int no);
}
