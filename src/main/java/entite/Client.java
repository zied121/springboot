package entite;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private Long idClient;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "date_naissance")
    private LocalDate dateNaissance;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_carte_fidelite", referencedColumnName = "id_carte_fidelite")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CarteFidelite carteFidelite;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_adresse", referencedColumnName = "id_adresse")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Adresse adresse;





    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Commande> commandes = new ArrayList<>();


}