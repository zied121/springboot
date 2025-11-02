package repositeries;
import org.springframework.data.jpa.repository.JpaRepository;

import entite.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
