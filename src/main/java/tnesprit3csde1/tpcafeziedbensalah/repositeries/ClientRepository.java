package tnesprit3csde1.tpcafeziedbensalah.repositeries;
import org.springframework.data.jpa.repository.JpaRepository;

import tnesprit3csde1.tpcafeziedbensalah.entite.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
