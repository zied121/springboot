package tnesprit3csde1.tpcafeziedbensalah.entite;

import jakarta.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="promotion")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_promotion")
    private Long idPromotion;

    @Column(name = "pourcentage_promo")
    private float pourcentagePromo;

    @Column(name = "date_debut_promo")
    private LocalDate dateDebutPromo;

    @Column(name = "date_fin_promo")
    private LocalDate dateFinPromo;

    @ManyToMany(mappedBy = "promotions")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Article> articles = new ArrayList<>();
}