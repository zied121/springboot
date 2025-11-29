package tnesprit3csde1.tpcafeziedbensalah.Services;
import java.util.List;
import tnesprit3csde1.tpcafeziedbensalah.entite.Article;
import tnesprit3csde1.tpcafeziedbensalah.repositeries.ArticleRepository;

public class ArticleService implements IArticleService {
    ArticleRepository articleRepository;

    @Override
    public Article addArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public List<Article> saveArticles(List<Article> articles) {
        return articleRepository.saveAll(articles);
    }

    @Override
    public Article selectArticleByIdWithGet(long id) {
        return articleRepository.findById(id).get();
    }

    @Override
    public Article selectArticleByIdWithOrElse(long id) {
        Article fakeArticle = Article.builder()
                .nomArticle(" Article 1")
                .prixArticle(1000)
                .build();
        return articleRepository.findById(id).orElse(fakeArticle);
    }

    @Override
    public List<Article> selectAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public void deleteArticle(Article article) {
        articleRepository.delete(article);
    }

    @Override
    public void deleteAllArticles() {
        articleRepository.deleteAll();
    }

    @Override
    public void deleteArticleById(long id) {
        articleRepository.deleteById(id);
    }

    @Override
    public long countingArticles() {
        return articleRepository.count();
    }

    @Override
    public boolean verifArticleById(long id) {
        return articleRepository.existsById(id);
    }
}
