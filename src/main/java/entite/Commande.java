package entite;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_commande")
    private Long idCommande;

    @Column(name = "date_commande")
    private LocalDate dateCommande;

    @Column(name = "total_commande")
    private float totalCommande;

    @Column(name = "status_commande")
    @Enumerated(EnumType.STRING)
    private StatusCommande StatusCommande;
}