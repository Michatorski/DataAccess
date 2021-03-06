package org.iesfm.tiendamongo.repository;

import org.iesfm.tiendamongo.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ArticleRepository extends MongoRepository<Article, Integer> {

    List<Article> findByOrder();
}
