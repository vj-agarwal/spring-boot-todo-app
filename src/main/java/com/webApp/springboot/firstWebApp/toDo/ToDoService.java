package com.webApp.springboot.firstWebApp.toDo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	
	private static List<ToDo> todos = new ArrayList<>();
	static {
		todos.add(new ToDo(1,"youtube","Learn SpringBoot", LocalDate.now().plusYears(1), false));
		todos.add(new ToDo(2,"youtube","Angular", LocalDate.now().plusYears(1), true));
	}
	
	public List<ToDo> findByUserName(String username){
		return todos;
	}
}
