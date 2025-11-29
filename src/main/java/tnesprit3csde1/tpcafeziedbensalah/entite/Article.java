package tnesprit3csde1.tpcafeziedbensalah.entite;

import jakarta.persistence.*;
import java.util.ArrayList;
import lombok.EqualsAndHashCode;

import lombok.ToString;
import java.util.List;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name ="article")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_article")
    Long idArticle;

    @Column(name = "nom_article")
    String nomArticle;

    @Column(name = "prix_article")
    float prixArticle;

    @Column(name = "type_article")
    @Enumerated(EnumType.STRING)
    TypeArticle typeArticle;

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Builder.Default
    List<Detail_Commande> detailCommandes = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "article_promotion",
            joinColumns = @JoinColumn(name = "id_article"),
            inverseJoinColumns = @JoinColumn(name = "id_promotion")
    )
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Builder.Default
    List<Promotion> promotions = new ArrayList<>();


}