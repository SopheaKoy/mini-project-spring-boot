package co.istad.reponsitory;

import co.istad.model.Article;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArticleReponsitory {

//        @Select("SELECT * FROM articles")
//        List<Article> select();
//        // insert
//        @Insert("""
//            INSERT INTO articles (uuid, username,fullName,category,description,thumbnail)
//            VALUES (#{a.uuid}, #{a.username},#{a.fullName},#{a.category},#{a.description}, #{a.thumbnail})
//            """)
//        void insert(@Param("a") Article article);
//
//        //select by uuid
//        @Select("SELECT * FROM articles WHERE uuid = #{uuid}")
//        Article selectByUuid(String uuid);
//
//        //update
//        @Update("""
//           UPDATE articles SET
//           SET username = #{a.username},
//                fullName =#{a.fullName},
//                category=#{a.category},
//                description = #{a.description},
//                thumbnail = #{a.thumbnail},
//             WHERE uuid =  #{a.uuid}
//            """)
//        void updateByUuid(@Param("a") Article newArticle);
//
//        // delete
//        @Delete("DELETE FROM articles WHERE uuid = #{a.uuid}")
//        void deleteByUuid(String uuid);
}
