package tnesprit3csde1.tpcafeziedbensalah.Services;

import tnesprit3csde1.tpcafeziedbensalah.entite.Adresse;

import java.util.List;

public interface IAdresseService {
    Adresse addAdresse(Adresse adresse);
    List<Adresse> saveAdresses(List<Adresse> adresses);
    Adresse selectAdresseByIdWithGet(long id);
    Adresse selectAdresseByIdWithOrElse(long id);
    List<Adresse> selectAllAdresses();
    void deleteAdresse(Adresse adresse);
    void deleteAllAdresses();

    void deleteAdresseById(long id);
    long countingAdresses();
    boolean verifAdresseById(long id);


}