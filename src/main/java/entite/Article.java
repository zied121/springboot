package entite;

import jakarta.persistence.*;
import java.util.ArrayList;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;

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

    @OneToMany(mappedBy = "articles",cascade = CascadeType.ALL)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Detail_Commande> detailCommandes = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "article_promotion", joinColumns = @JoinColumn(name = "id_article"), inverseJoinColumns = @JoinColumn(name = "id_promotion"))
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Promotion> promotions = new ArrayList<>();




}