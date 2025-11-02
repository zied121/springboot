package entite;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "detail_commande")
public class Detail_Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detail_commande")
    private Long idDetailCommande;

    @Column(name = "quantite_article")
    private int quantiteArticle;

    @Column(name = "sous_total_detail_article")
    private float sousTotalDetailArticle;

    @Column(name = "sous_total_detail_article_apres_promo")
    private float sousTotalDetailArticleApresPromo;

    @ManyToOne
    @JoinColumn(name = "id_commande", referencedColumnName = "id_commande")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Commande commande;

    @ManyToOne
    @JoinColumn(name = "id_article", referencedColumnName = "id_article")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Article article;
}