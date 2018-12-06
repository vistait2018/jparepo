package com.prac.controller;

import com.prac.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Perspective on 12/5/2018.
 */
@Controller
public class BookController {

    private BookRepository bookRepository;
     @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBook(Model model){
        model.addAttribute("books", bookRepository.findAll());
        return"books";
    }
}
