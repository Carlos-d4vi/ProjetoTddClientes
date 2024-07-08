package Service;

import Domain.Client;

import java.util.HashMap;
import java.util.Map;

public class ClientService {
    static Map<Long, Client> clientes = new HashMap<>();

    public void adicionarCliente(Client client){
        if (clientes.get(client.getCpf()) == null){
            clientes.put(client.getCpf(), client);
        }else {
            System.out.println("cliente já cadastrado!");
        }
    }
    public Client pesquisarCliente(Long cpf){
        if (clientes.get(cpf) == null){
            System.out.println("não encontrado!");
        }
        else {
        System.out.println(clientes.get(cpf).getNome());
        return  clientes.get(cpf);
        }
        return null;

    }
    public void alterarCliente(Long cpf,Client client){

        if (clientes.get(cpf) != null){
            clientes.put(client.getCpf(), client);

            System.out.println("Informações do Cliente " + pesquisarCliente(cpf).getNome() + " alteradas!");
            System.out.println("Informações antigas: ");
            System.out.println("Nome: " + pesquisarCliente(cpf).getNome());
            System.out.println("Cpf: " + pesquisarCliente(cpf).getCpf());
            System.out.println("==============================");
            System.out.println("Novas Informações: ");
            System.out.println("Nome: " + client.getNome());
            System.out.println("Cpf: " + client.getCpf());

            clientes.remove(cpf);
        }else {
            System.out.println("cliente não encontrado!");
        }
    }
    public void excluirCliente(Long cpf){
        if (clientes.get(cpf) != null){
            clientes.remove(cpf);
            System.out.println("Cliente " + cpf + " excluido do sistema!");
        }else {
            System.out.println("Cliente não encontrado!");
        }
    }
}
