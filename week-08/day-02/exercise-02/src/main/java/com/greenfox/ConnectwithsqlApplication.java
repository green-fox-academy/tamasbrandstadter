package com.greenfox;

import com.greenfox.model.Todo;
import com.greenfox.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectWithSqlApplication implements CommandLineRunner{

	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ConnectWithSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("I have to learn Object Relational Mapping", false, false));
		todoRepository.save(new Todo("Finish H2 workshop", false, false));
		todoRepository.save(new Todo("finish exercise", true, true));
    todoRepository.save(new Todo("have some fun", true, true));
	}
}
