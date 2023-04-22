package co.istad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AuthorController {
    @GetMapping("/authors")
    String viewAllAuthor(){
        return "pages/authors/allAuthors";
    }

}
