package entite;

import jakarta.persistence.*;

@Entity
@Table(name ="article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArticle;
    @Column(name="nomArticle")
    private String nomArticle;
    @Column(name="prixArticle")
    private float prixArticle;
    @Enumerated (EnumType.STRING)
    @Column(name="TypeArticle")
    private TypeArticle TypeArticle;




}