package com.ey.day9.Q3;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.ey.day9.Q1.Author;

public class AuthorServiceImpl implements AuthorService {

    public Set<String> getUniqueSurnames(List<Author> authorList) {
        return authorList.stream()
                .map(author -> author.getSurname().toUpperCase())
                .collect(Collectors.toSet());
    } 
    public List<Author> getAuthorsByCity(List<Author> authorList, String city) {
        return authorList.stream()
                .filter(author -> city.equals(author.getCity()))
                .collect(Collectors.toList());
    }
    public double femaleAverageAge(List<Author> authorList) {
        return authorList.stream()
                .filter(author -> "female".equalsIgnoreCase(author.getGender()))
                .mapToDouble(author -> LocalDate.now().getYear() - author.getBirthdate().getYear())
                .average()
                .orElse(0.0);
    }
    public Long getMobileByAdhar(List<Author> authorList, Long adharCard) {
        return authorList.stream()
                .filter(author -> adharCard.equals(author.getAdharCard()))
                .map(Author::getMobile)
                .findFirst()
                .orElse(null);
    }
}