package desafio.projeto.service;

import desafio.projeto.model.Client;

public interface ClientService {
    Iterable<Client> searchAll();

    Client searchById(Long id);

    void insert(Client client);

    void update(Long id, Client client);

    void del(Long id);

}
