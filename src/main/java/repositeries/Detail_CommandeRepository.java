package repositeries;

import entite.Detail_Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Detail_CommandeRepository extends JpaRepository<Detail_Commande, Long> {
}
