package Mocks;

import Domain.Client;
import Domain.IMenu;

public class MenuMock implements IMenu {

    @Override
    public Client alterarCliente() {
        Client client = new Client("Joana", 12345678900L);
        return client;
    }
}
