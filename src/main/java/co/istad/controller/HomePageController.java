package co.istad.controller;

import co.istad.model.Article;
import co.istad.model.Category;
import co.istad.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@Controller
@RequiredArgsConstructor
public class HomePageController {

    private final ArticleService articleService;

    @GetMapping("/")
    String viewHome(Model model){
        List<Category> categories = articleService.findAllCategory();
        List<Article> articles = articleService.findAll();
        model.addAttribute("articles", articles);
        model.addAttribute("categories", categories);
        return "pages/index";
    }

}
