package tnesprit3csde1.tpcafeziedbensalah.Services;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tnesprit3csde1.tpcafeziedbensalah.entite.Adresse;
import tnesprit3csde1.tpcafeziedbensalah.repositeries.AdresseRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class AdresseService  implements IAdresseService {
    AdresseRepository adresseRepository;
    @Override
    public Adresse addAdresse(Adresse adresse) {
        return adresseRepository.save(adresse);
    }

    @Override
    public List<Adresse> saveAdresses(List<Adresse> adresses) {
        return adresseRepository.saveAll(adresses);
    }

    @Override
    public Adresse selectAdresseByIdWithGet(long id) {
        return adresseRepository.findById(id).get() ;
    }

    @Override
    public Adresse selectAdresseByIdWithOrElse(long id) {
        Adresse fakeUser = Adresse.builder().rue("tunis ").ville("soukra").codePostal("2036").idAdresse(1200).build();
        return adresseRepository.findById(id).orElse(null)  ;
    }

    @Override
    public List<Adresse> selectAllAdresses() {
        return adresseRepository.findAll();
    }

    @Override
    public void deleteAdresse(Adresse adresse) {
        adresseRepository.delete(adresse);

    }

    @Override
    public void deleteAllAdresses() {
        adresseRepository.deleteAll();

    }

    @Override
    public void deleteAdresseById(long id) {
        adresseRepository.deleteById(id);

    }

    @Override
    public long countingAdresses() {
        return adresseRepository.count();
    }

    @Override
    public boolean verifAdresseById(long id) {
        return adresseRepository.existsById(id);
    }
}
