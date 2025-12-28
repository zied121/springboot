package tnesprit3csde1.tpcafeziedbensalah.Services;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import tnesprit3csde1.tpcafeziedbensalah.entite.Client;
import tnesprit3csde1.tpcafeziedbensalah.repositeries.CarteFideliteRepository;
import tnesprit3csde1.tpcafeziedbensalah.repositeries.ClientRepository;

@Service
@AllArgsConstructor

public class Clientservice implements IClientService {
    private final ClientRepository clientRepository;
    private final CarteFideliteRepository carteFideliteRepository;


    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> saveClients(List<Client> clients) {
        return clientRepository.saveAll(clients);
    }

    @Override
    public Client selectClientByIdWithGet(long id) {
        return clientRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Client not found with id: " + id));
    }

    @Override
    public Client selectClientByIdWithOrElse(long id) {
        Client fakeClient = Client.builder()
                .nom("zied")
                .prenom("ben salah")
                .dateNaissance(LocalDate.of(1990, 1, 1))
                .build();
        return clientRepository.findById(id).orElse(fakeClient);
    }

    @Override
    public List<Client> selectAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public void deleteClient(Client client) {
        clientRepository.delete(client);
    }

    @Override
    public void deleteAllClients() {
        clientRepository.deleteAll();
    }

    @Override
    public void deleteClientById(long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public long countingClients() {
        return clientRepository.count();
    }

    @Override
    public boolean verifClientById(long id) {
        return clientRepository.existsById(id);
    }

    @Override
    public List<Client> incrementerPts() {
        List<Client> list = clientRepository.findByDateNaissance(LocalDate.now());
        for (Client c : list) {
            if (c.getCarteFidelite() != null) {
                int current = c.getCarteFidelite().getPointsAccumules();
                c.getCarteFidelite().setPointsAccumules(current + 10);
               carteFideliteRepository.save(c.getCarteFidelite());
            }
        }
        return list;
    }
}