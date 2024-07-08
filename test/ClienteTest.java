import Domain.Client;
import Domain.IMenu;
import Domain.Menu;
import Mocks.MenuMock;
import Service.ClientService;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ClienteTest {

    @Test
    public void TestCriarClient(){
        ClientService clientService = new ClientService();
        Client client = new Client("Carlos", 22592151737L);
        clientService.adicionarCliente(client);

    }

    @Test
    public void TestCriarClientEPesquisarPorCpf(){
        ClientService clientService = new ClientService();
        Client client = new Client("Carlos", 22592151737L);
        clientService.adicionarCliente(client);
        Assert.assertNotNull(clientService.pesquisarCliente(22592151737L));
    }

    @Test
    public void TestAlterarClienteExistente(){
        ClientService clientService = new ClientService();
        MenuMock menuMock = new MenuMock();
        Client client = new Client("Carlos", 22592151737L);
        clientService.adicionarCliente(client);
        Client client2 = new Client("Joana", 12345678900L);

        clientService.alterarCliente(22592151737L ,client2);

        Assert.assertEquals("Joana", clientService.pesquisarCliente(12345678900L).getNome());
    }

    @Test
    public void TestExcluirClienteExistente(){
        ClientService clientService = new ClientService();
        Client client = new Client("Carlos", 22592151737L);
        clientService.adicionarCliente(client);

        clientService.excluirCliente(22592151737L);

        Assert.assertNull(clientService.pesquisarCliente(22592151737L));
    }
}
