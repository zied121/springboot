package tnesprit3csde1.tpcafeziedbensalah.Services;

import tnesprit3csde1.tpcafeziedbensalah.entite.Detail_Commande;
import tnesprit3csde1.tpcafeziedbensalah.repositeries.Detail_CommandeRepository;
import java.util.List;

public class DetailCommandeService implements IDetailCommandeService {
    Detail_CommandeRepository detailCommandeRepository;

    @Override
    public Detail_Commande addDetailCommande(Detail_Commande detailCommande) {
        return detailCommandeRepository.save(detailCommande);
    }

    @Override
    public List<Detail_Commande> saveDetailCommandes(List<Detail_Commande> detailCommandes) {
        return detailCommandeRepository.saveAll(detailCommandes);
    }

    @Override
    public Detail_Commande selectDetailCommandeByIdWithGet(long id) {
        return detailCommandeRepository.findById(id).get();
    }

    @Override
    public Detail_Commande selectDetailCommandeByIdWithOrElse(long id) {
        Detail_Commande fakeDetailCommande = Detail_Commande.builder()
                .quantiteArticle(5)
                .sousTotalDetailArticle(5000)
                .sousTotalDetailArticleApresPromo(1200)
                .build();
        return detailCommandeRepository.findById(id).orElse(fakeDetailCommande);
    }

    @Override
    public List<Detail_Commande> selectAllDetailCommandes() {
        return detailCommandeRepository.findAll();
    }

    @Override
    public void deleteDetailCommande(Detail_Commande detailCommande) {
        detailCommandeRepository.delete(detailCommande);
    }

    @Override
    public void deleteAllDetailCommandes() {
        detailCommandeRepository.deleteAll();
    }




    @Override
    public void deleteDetailCommandeById(long id) {
        detailCommandeRepository.deleteById(id);
    }

    @Override
    public long countingDetailCommandes() {
        return detailCommandeRepository.count();
    }

    @Override
    public boolean verifDetailCommandeById(long id) {
        return detailCommandeRepository.existsById(id);
    }
}