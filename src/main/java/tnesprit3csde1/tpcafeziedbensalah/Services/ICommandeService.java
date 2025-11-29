package tnesprit3csde1.tpcafeziedbensalah.Services;
import tnesprit3csde1.tpcafeziedbensalah.entite.Commande;
import java.util.List;

public interface ICommandeService {
    Commande addCommande(Commande commande);
    List<Commande> saveCommandes(List<Commande> commandes);
    Commande selectCommandeByIdWithGet(long id);
    Commande selectCommandeByIdWithOrElse(long id);
    List<Commande> selectAllCommandes();
    void deleteCommande(Commande commande);
    void deleteAllCommandes();
    void deleteCommandeById(long id);
    long countingCommandes();
    boolean verifCommandeById(long id);
}