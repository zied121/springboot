package entite;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


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

    @ManyToOne
    @JoinColumn(name = "id_client", referencedColumnName = "id_client")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Client client;

    // One commande has many detail_commande
    @OneToMany(mappedBy = "commande", cascade = CascadeType.ALL)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Detail_Commande> detailCommandes = new ArrayList<>();


}