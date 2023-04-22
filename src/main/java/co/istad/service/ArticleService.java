package co.istad.service;

import co.istad.model.Article;
import co.istad.model.Category;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ArticleService {

    //Your logic
    List<Article> findAll();
    //List of category
    List<Category> findAllCategory();

   // Article findByUuid(String uuid);

    // Check File
    boolean save(Article article,Category categories, MultipartFile file);
}
