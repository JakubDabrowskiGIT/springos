package pl.kurs2.springos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.kurs2.springos.model.Book;


@Controller
public class BookController {

    @GetMapping("/book")
    public String getBooks(ModelMap modelMap, BookDao bookDao){
        modelMap.addAttribute("books", bookDao.findAll());
        return "book";
    }


    @PostMapping("/create")
    public String create(@ModelAttribute Book book, ModelMap modelMap){
        System.out.println(book);
        modelMap.addAttribute("book", book);
        return "book";

    }
}
