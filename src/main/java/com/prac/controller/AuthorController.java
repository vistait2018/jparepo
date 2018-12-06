package com.prac.controller;

import com.prac.repo.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Perspective on 12/5/2018.
 */
@Controller
public class AuthorController {
   private AuthorRepository authorRepository;

   @Autowired
    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    @RequestMapping("/authors")
    public String getAuthor(Model model){
       model.addAttribute("authors",authorRepository.findAll());
       return"authors";
    }
    public String greet(){
        System.out.println("Hello there");
        return "Hello There";
    }
}
