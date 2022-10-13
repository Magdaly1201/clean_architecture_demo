package com.magdy.demo.cleanArchitecture.core.person.model;

import com.magdy.demo.cleanArchitecture.core.book.model.Book;
import com.magdy.demo.cleanArchitecture.core.film.model.Film;

public class PersonRequest {

    private Long dni;
    private String name;
    private Book book;
    private Film film;

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
}
