package co.istad.service.impl;

import co.istad.model.Article;
import co.istad.model.Category;
import co.istad.model.FileUpload;
import co.istad.reponsitory.ArticleReponsitory;
import co.istad.reponsitory.StaticReponsitory;
import co.istad.service.ArticleService;
import co.istad.service.FileUploadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {


    private final FileUploadService fileUploadService;
    private final StaticReponsitory staticReponsitory;


    @Override
    public List<Article> findAll() {
        return staticReponsitory.getArticles();
    }
    @Override
    public List<Category> findAllCategory() {
        return staticReponsitory.getCategories();
    }

    @Override
    public boolean save(Article articles,Category categories, MultipartFile file) {
        FileUpload fileUpload =fileUploadService.uploadSingle(file);
        if(fileUpload.isSucceed()){
            articles.setUuid(UUID.fromString(UUID.randomUUID().toString()));
            articles.setThumbnail(fileUpload.fileName());
            staticReponsitory.getArticles().add(articles);
            staticReponsitory.getCategories().add(categories);
        }
        return true;
    }
}
