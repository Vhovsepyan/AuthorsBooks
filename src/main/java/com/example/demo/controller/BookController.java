package com.example.demo.controller;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping(value = "/all")
    public String showBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "home";
    }

    @GetMapping(value = "/form")
    public String createForm(Model model) {
        model.addAttribute(new Book());
        model.addAttribute(new Author());
        return "createForm";
    }

    @RequestMapping(value = "all")
    public ModelAndView create(@ModelAttribute Book book, @ModelAttribute Author author) {
        Author oldAuthor = authorRepository.getAuthorByUniqueId(author.getUniqueId());
        if (oldAuthor == null) {
            book.addAuthor(author);
        } else {
            book.addAuthor(oldAuthor);
        }
        bookRepository.save(book);
        return new ModelAndView("redirect:/books/all");
    }

    @RequestMapping(value = "actions", params = "edit")
    public ModelAndView edit(@ModelAttribute Book book) {
        return new ModelAndView("redirect:/books/all");
    }

    @PostMapping(value = "actions", params = "delete")
    public ModelAndView delete(@ModelAttribute Book book, @RequestParam("delete") long id) {
        bookRepository.deleteById(id);
        return new ModelAndView("redirect:/books/all");
    }

}