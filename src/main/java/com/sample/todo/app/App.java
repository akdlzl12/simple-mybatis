package com.sample.todo.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sample.todo.service.TodoService;
import com.sample.todo.vo.Todo;

public class App {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/app-context.xml";
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		TodoService service = context.getBean(TodoService.class);
		List<Todo> todos = service.getAllSeletes();
		Todo todo = new Todo();
		todo.setTitle("아아마이크테스트");
		todo.setDates("2017-12-05");
		todo.setContents("마이크췍");
		todo.setCompleted("예");
		todo.setDeleted("Y");
		service.insertInfomation(todo);
		
		System.out.println(todos.size());
	}
}
