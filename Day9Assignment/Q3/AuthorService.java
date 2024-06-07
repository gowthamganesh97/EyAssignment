package com.ey.day9.Q3;

import java.util.List;
import java.util.Set;

import com.ey.day9.Q1.Author;

public interface AuthorService{
	public abstract Set<String> getUniqueSurnames(List<Author> authorList);
	public abstract List<Author> getAuthorsByCity(List<Author> authorList,String city);
	public abstract double femaleAverageAge(List<Author> authorList);
	public abstract Long getMobileByAdhar(List<Author> authorList,Long adharCard);

}
