package tnesprit3csde1.tpcafeziedbensalah.entite;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDate;

@Entity
@Table(name = "carte_fidelite")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CarteFidelite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carte_fidelite")
    private Long idCarteFidelite;

    @Column(name = "points_accumules")
    private int pointsAccumules;

    @Column(name = "date_creation")
    private LocalDate dateCreation;


    @OneToOne(mappedBy = "carteFidelite")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Client client;
}