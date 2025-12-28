package tnesprit3csde1.tpcafeziedbensalah.Services;
import tnesprit3csde1.tpcafeziedbensalah.entite.Article;

import java.util.List;

public interface IArticleService {
    Article addArticle(Article article);
    List<Article>   saveArticles(List<Article> articles);
    Article selectArticleByIdWithGet(long id);
    Article selectArticleByIdWithOrElse(long id);
    List<Article> selectAllArticles();
    void deleteArticle(Article article);
    void deleteAllArticles();
    void deleteArticleById(long id);
    long countingArticles();
    boolean verifArticleById(long id);
    List<Article> findByPromotionStartMonth(int month);
}
