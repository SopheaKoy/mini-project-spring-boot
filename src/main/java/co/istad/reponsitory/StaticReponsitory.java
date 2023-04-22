package co.istad.reponsitory;

import co.istad.model.Article;
import co.istad.model.Author;
import co.istad.model.Category;
import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
@Getter
public class StaticReponsitory {

    private  Faker faker;
    @Autowired
    public void setFaker(Faker faker) {
        this.faker = faker;
    }

    private List<Article> articles;

    private List<Category> categories;


    @PostConstruct()
    void init(){
        articles = new ArrayList<>(){{
            add(new Article(UUID.randomUUID(), new Author(faker.name().username(), faker.name().firstName()), faker.weather().description(), "monkey.jpg"));
        }};
        categories = new ArrayList<>(){{
            add(new Category("Education"));
            add(new Category("Sport"));
            add(new Category("Programming"));
            add(new Category("Science"));
            add(new Category("Biology"));
            add(new Category("Other"));
        }};
    }
}
