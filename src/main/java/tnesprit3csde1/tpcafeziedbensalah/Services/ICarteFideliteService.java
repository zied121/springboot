package tnesprit3csde1.tpcafeziedbensalah.Services;
import java.util.List;
import tnesprit3csde1.tpcafeziedbensalah.entite.CarteFidelite;

public interface ICarteFideliteService {
    CarteFidelite addCarteFidelite(CarteFidelite carteFidelite);
    List<CarteFidelite> saveCartesFidelite(List<CarteFidelite> cartesFidelite);
    CarteFidelite selectCarteFideliteByIdWithGet(long id);
    CarteFidelite selectCarteFideliteByIdWithOrElse(long id);
    List<CarteFidelite> selectAllCartesFidelite();
    void deleteCarteFidelite(CarteFidelite carteFidelite);
    void deleteAllCartesFidelite();
    void deleteCarteFideliteById(long id);
    long countingCartesFidelite();
    boolean verifCarteFideliteById(long id);
}
