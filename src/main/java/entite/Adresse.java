package entite;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Entity
@Table(name = "adresse")

public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adresse")
    private Long idAdresse;

    @Column(name = "rue")
    private String rue;

    @Column(name = "ville")
    private String ville;

    @Column(name = "code_postal")
    private String codePostal;


    @OneToOne(mappedBy = "adresse")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Client client;



}