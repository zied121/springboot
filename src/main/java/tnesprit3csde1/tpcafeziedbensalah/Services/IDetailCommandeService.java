package tnesprit3csde1.tpcafeziedbensalah.Services;

import tnesprit3csde1.tpcafeziedbensalah.entite.Detail_Commande;
import java.util.List;

public interface IDetailCommandeService {
    Detail_Commande addDetailCommande(Detail_Commande detailCommande);
    List<Detail_Commande> saveDetailCommandes(List<Detail_Commande> detailCommandes);
    Detail_Commande selectDetailCommandeByIdWithGet(long id);
    Detail_Commande selectDetailCommandeByIdWithOrElse(long id);
    List<Detail_Commande> selectAllDetailCommandes();
    void deleteDetailCommande(Detail_Commande detailCommande);
    void deleteAllDetailCommandes();
    void deleteDetailCommandeById(long id);
    long countingDetailCommandes();
    boolean verifDetailCommandeById(long id);
}