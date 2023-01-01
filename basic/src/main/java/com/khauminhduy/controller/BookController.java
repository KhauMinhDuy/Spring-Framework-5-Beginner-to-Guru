package com.khauminhduy.controller;

import com.khauminhduy.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
public class BookController {

    private final BookRepository bookRepository;

    @RequestMapping(value = "/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books/list";
    }

}
