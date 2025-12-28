package tnesprit3csde1.tpcafeziedbensalah.Services;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tnesprit3csde1.tpcafeziedbensalah.entite.CarteFidelite;
import tnesprit3csde1.tpcafeziedbensalah.repositeries.CarteFideliteRepository;

import java.time.LocalDate;
import java.util.List;


@Service
@AllArgsConstructor
public class CarteFideliteService implements ICarteFideliteService {

    CarteFideliteRepository carteFideliteRepository;
    @Override
    public CarteFidelite addCarteFidelite(CarteFidelite carteFidelite) {
        return carteFideliteRepository.save(carteFidelite);
    }

    @Override
    public List<CarteFidelite> saveCartesFidelite(List<CarteFidelite> cartesFidelite) {
        return carteFideliteRepository.saveAll(cartesFidelite);
    }

    @Override
    public CarteFidelite selectCarteFideliteByIdWithGet(long id) {
        return carteFideliteRepository.findById(id).get();
    }

    @Override
    public CarteFidelite selectCarteFideliteByIdWithOrElse(long id) {
        CarteFidelite fakeCarteFidelite = CarteFidelite.builder()
                .pointsAccumules(100)
                .dateCreation(LocalDate.now())
                .build();
        return carteFideliteRepository.findById(id).orElse(fakeCarteFidelite);
    }

    @Override
    public List<CarteFidelite> selectAllCartesFidelite() {
        return carteFideliteRepository.findAll();
    }

    @Override
    public void deleteCarteFidelite(CarteFidelite carteFidelite) {
        carteFideliteRepository.delete(carteFidelite);
    }

    @Override
    public void deleteAllCartesFidelite() {
        carteFideliteRepository.deleteAll();
    }

    @Override
    public void deleteCarteFideliteById(long id) {
        carteFideliteRepository.deleteById(id);
    }

    @Override
    public long countingCartesFidelite() {
        return carteFideliteRepository.count();
    }

    @Override
    public boolean verifCarteFideliteById(long id) {
        return carteFideliteRepository.existsById(id);
    }
}
