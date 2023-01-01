package com.khauminhduy.controller;

import com.khauminhduy.repositories.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    @RequestMapping(value = "/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors/list";
    }

}
