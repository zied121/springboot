package tnesprit3csde1.tpcafeziedbensalah.repositeries;
import org.springframework.data.jpa.repository.JpaRepository;

import tnesprit3csde1.tpcafeziedbensalah.entite.Client;

import java.time.LocalDate;
import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {


    List<Client> findByDateNaissance(LocalDate dateNaissance);

}
