package com.ey.day9.Q2;
import java.time.LocalDate;
import java.util.List;

import com.ey.day9.Q1.Author;

import com.ey.day9.Q3.AuthorService;
import com.ey.day9.Q3.AuthorServiceImpl;

public class Authorinfo {
	 public static void main(String[] args) {
	        // Create a list of authors
		 List<Author> authorList = List.of(
				    new Author(123456789L, "Smith", "John", "Doe", LocalDate.of(1980, 5, 15), "male", "Seattle", 9876543210L),
				    new Author(987654321L, "Smith", "Jane", "Doe", LocalDate.of(1985, 8, 20), "female", "San Francisco", 1234567890L),
				    new Author(456789123L, "Brown", "Michael", "Johnson", LocalDate.of(1975, 3, 10), "male", "Boston", 6543210987L)
				);
	        
	        AuthorService authorService=new AuthorServiceImpl();

	        
	        System.out.println("Unique surnames: " + authorService.getUniqueSurnames(authorList));
	        System.out.println("Authors from New York: " + authorService.getAuthorsByCity(authorList, "New York"));
	        System.out.println("Female average age: " + authorService.femaleAverageAge(authorList));
	        System.out.println("Mobile number of author with adhar card 987654321: " + authorService.getMobileByAdhar(authorList, 987654321L));
	    }
	}
