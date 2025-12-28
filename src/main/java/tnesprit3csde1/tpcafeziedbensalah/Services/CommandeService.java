package tnesprit3csde1.tpcafeziedbensalah.Services;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tnesprit3csde1.tpcafeziedbensalah.entite.Commande;
import tnesprit3csde1.tpcafeziedbensalah.repositeries.CommandeRepository;

import java.time.LocalDate;
import java.util.List;


@Service
@AllArgsConstructor
public class CommandeService implements ICommandeService {
    CommandeRepository commandeRepository;

    @Override
    public Commande addCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public List<Commande> saveCommandes(List<Commande> commandes) {
        return commandeRepository.saveAll(commandes);
    }

    @Override
    public Commande selectCommandeByIdWithGet(long id) {
        return commandeRepository.findById(id).get();
    }

    @Override
    public Commande selectCommandeByIdWithOrElse(long id) {
        Commande fakeCommande = Commande.builder()
                .dateCommande(LocalDate.now())
                .totalCommande(1200)
                .build();
        return commandeRepository.findById(id).orElse(fakeCommande);
    }

    @Override
    public List<Commande> selectAllCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    public void deleteCommande(Commande commande) {
        commandeRepository.delete(commande);
    }

    @Override
    public void deleteAllCommandes() {
        commandeRepository.deleteAll();
    }

    @Override
    public void deleteCommandeById(long id) {
        commandeRepository.deleteById(id);
    }

    @Override
    public long countingCommandes() {
        return commandeRepository.count();
    }

    @Override
    public boolean verifCommandeById(long id) {
        return commandeRepository.existsById(id);
    }
}