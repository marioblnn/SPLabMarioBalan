package com.example.splab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.splab.model.Author;
import com.example.splab.model.Book;
import com.example.splab.model.Element;
import com.example.splab.model.Paragraph;
import com.example.splab.model.Section;


@SpringBootApplication
public class SplabApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplabApplication.class, args);
		Element content = new Element();
		content.add(new Section("Capitolul 1"));
		content.add(new Paragraph("Hi there"));
		Book book = new Book("Some Book", new Author("Me", "MEEE"), content);
		book.printBookDetails();
	}

}
