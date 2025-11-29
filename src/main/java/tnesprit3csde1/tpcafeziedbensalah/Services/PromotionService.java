package tnesprit3csde1.tpcafeziedbensalah.Services;
import tnesprit3csde1.tpcafeziedbensalah.entite.Promotion;
import tnesprit3csde1.tpcafeziedbensalah.repositeries.PromotionRepository;
import java.time.LocalDate;
import java.util.List;

public class PromotionService implements IPromotionService {
    PromotionRepository promotionRepository;

    @Override
    public Promotion addPromotion(Promotion promotion) {
        return promotionRepository.save(promotion);
    }

    @Override
    public List<Promotion> savePromotions(List<Promotion> promotions) {
        return promotionRepository.saveAll(promotions);
    }

    @Override
    public Promotion selectPromotionByIdWithGet(long id) {
        return promotionRepository.findById(id).get();
    }

    @Override
    public Promotion selectPromotionByIdWithOrElse(long id) {
        Promotion fakePromotion = Promotion.builder()
                .pourcentagePromo(0.0f)
                .dateDebutPromo(LocalDate.now())
                .dateFinPromo(LocalDate.now().plusDays(7))
                .build();
        return promotionRepository.findById(id).orElse(fakePromotion);
    }

    @Override
    public List<Promotion> selectAllPromotions() {
        return promotionRepository.findAll();
    }

    @Override
    public void deletePromotion(Promotion promotion) {
        promotionRepository.delete(promotion);
    }

    @Override
    public void deleteAllPromotions() {
        promotionRepository.deleteAll();
    }

    @Override
    public void deletePromotionById(long id) {
        promotionRepository.deleteById(id);
    }

    @Override
    public long countingPromotions() {
        return promotionRepository.count();
    }

    @Override
    public boolean verifPromotionById(long id) {
        return promotionRepository.existsById(id);
    }
}