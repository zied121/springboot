package tnesprit3csde1.tpcafeziedbensalah.Services;
import java.util.List;
import tnesprit3csde1.tpcafeziedbensalah.entite.Client;
public interface IClientService {
    Client addClient(Client client);
    List<Client> saveClients(List<Client> clients);
    Client selectClientByIdWithGet(long id);
    Client selectClientByIdWithOrElse(long id);
    List<Client> selectAllClients();
    void deleteClient(Client client);
    void deleteAllClients();
    void deleteClientById(long id);
    long countingClients();
    boolean verifClientById(long id);


}
