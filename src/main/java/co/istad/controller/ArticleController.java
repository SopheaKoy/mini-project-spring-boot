package co.istad.controller;


import co.istad.model.Article;
import co.istad.model.Category;
import co.istad.reponsitory.StaticReponsitory;
import co.istad.service.ArticleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequestMapping("articles")
@RequiredArgsConstructor
public class ArticleController {

    private final StaticReponsitory staticReponsitory;
    private final ArticleService articleService;

    @GetMapping("/new")
    String newViewArticle(Model model,Article articles ){
        List<Category> categories = articleService.findAllCategory();
        model.addAttribute("articles",articles);
        model.addAttribute("category",categories);
        return "pages/articles/addPost-new";
    }

    @GetMapping
    String viewArticle(Model model, Article article){
        model.addAttribute("article",article);
        List<Category> categories = articleService.findAllCategory();
        return "pages/articles/article";
    }

    @PostMapping("/new")
    String doSaveArticle(@ModelAttribute @Valid Article articles,
                         @ModelAttribute @Valid Category categories,
                         BindingResult result ,
                         @RequestParam("thumbnailFile")
//                       @RequestBody
                         MultipartFile file,
                         Model model) {
        if(result.hasErrors()){
            model.addAttribute("article", articles);
            model.addAttribute("category",categories);
            return "pages/index";
        }
        boolean isSuccess = articleService.save(articles,categories,file);
        if(isSuccess){
            return "redirect:/articles/article";
        }
        return "redirect:/articles/new";
    }
}
