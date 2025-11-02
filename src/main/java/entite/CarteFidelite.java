package entite;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "carte_fidelite")
public class CarteFidelite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carte_fidelite")
    private Long idCarteFidelite;

    @Column(name = "points_accumules")
    private int pointsAccumules;

    @Column(name = "date_creation")
    private LocalDate dateCreation;
}