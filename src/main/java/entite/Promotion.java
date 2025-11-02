package entite;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name ="promotion")
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
}