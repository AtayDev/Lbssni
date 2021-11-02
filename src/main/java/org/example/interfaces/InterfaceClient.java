package org.example.interfaces;

import org.example.beans.Client;

public interface InterfaceClient {
    public void addClient(Client client);
    public boolean updateClientByUsername(String username, Client newClient);
    public boolean deleteClientByUsername(String username);
    public int getIdByUsername(String username);
}
