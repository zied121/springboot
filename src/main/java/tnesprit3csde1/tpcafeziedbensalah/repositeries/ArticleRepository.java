package tnesprit3csde1.tpcafeziedbensalah.repositeries;

import tnesprit3csde1.tpcafeziedbensalah.entite.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    // Requête JPQL : jointure sur promotions et extraction du mois/année de dateDebutPromo
    @Query("select distinct a from Article a join a.promotions p where function('month', p.dateDebutPromo) = :month and function('year', p.dateDebutPromo) = :year")
    List<Article> findByPromotionStartMonthAndYear(@Param("month") int month, @Param("year") int year);

    // Méthode utilitaire: accepte seulement le mois et utilise l'année système
    default List<Article> findByPromotionStartMonth(int month) {
        return findByPromotionStartMonthAndYear(month, java.time.LocalDate.now().getYear());
    }



    // 1-
    @Query("SELECT a FROM Article a WHERE a.nomArticle = ?1")
    List<Article> getArticlesByNomJPQL(String nom);
    // 2-
    @Query("SELECT a FROM Article a WHERE a.typeArticle = ?1")
    List<Article> getArticlesByTypeJPQL(String type);
    // 3-
    @Query("SELECT a FROM Article a WHERE a.prixArticle = ?1")
    List<Article> getArticlesByPrixJPQL(float prix);
    // 4-
//    @Query("SELECT CASE WHEN COUNT(a) > 0 THEN true ELSE false END FROM Article a WHERE a.typeArticle = ?1")
//    boolean existsByNomArticle(String nom);
    // 5-
    @Query("SELECT COUNT(a) FROM Article a WHERE a.typeArticle = ?1")
    long countByTypeArticle(String type);
    // 6-
    @Query("SELECT a FROM Article a WHERE a.nomArticle LIKE %?1% AND a.typeArticle= ?2") //////
    List<Article> getArticlesByNomAndType(String nom,String type);
    // 7-
    @Query("SELECT a FROM Article a WHERE a.prixArticle BETWEEN ?1 AND ?2 AND a.typeArticle = ?3") //////
    List<Article> getArticlesByPrixAndType(float min,float max,String type);
    // 8-
//    @Query("SELECT a FROM Article a WHERE LOWER(a.nomArticle) LIKE CONCAT(LOWER(?1), '%') ORDER BY a.prixArticle ASC")
//    List<Article> getArticlesByNomStartsWithOrderByPrix(String nom);
    // 9-
    @Query("SELECT a FROM Article a WHERE a.prixArticle < ?1")
    List<Article> getArticlesByPrixMax(float max);
    // 10-
    @Query("SELECT a FROM Article a WHERE a.nomArticle =?1 OR a.prixArticle =?2 ORDER BY a.prixArticle DESC")
    List<Article> getByNomOrPrixDesc(String nom,long prix);
    // 11-
    @Query("SELECT a FROM Article a WHERE a.nomArticle LIKE ?1%")
    List<Article> getNomStartWith(String c);
    // 12-
    @Query("SELECT a FROM Article a WHERE a.nomArticle LIKE %?1")
    List<Article> getNomEndWith(String c);

    @Query("SELECT a FROM Article a JOIN a.promotions p WHERE MONTH (:date)" +
            " BETWEEN MONTH(p.dateDebutPromo) AND MONTH(p.dateFinPromo) AND YEAR(:date)" +
            " BETWEEN YEAR(p.dateDebutPromo) AND YEAR(p.dateFinPromo)")
    List<Article> findArticlesEnPromoByMonth(LocalDate date);
}
