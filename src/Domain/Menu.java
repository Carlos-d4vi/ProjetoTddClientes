package Domain;

import Service.ClientService;

import java.util.Scanner;

public class Menu implements IMenu{
    ClientService clientService = new ClientService();

    public void menuPrincipal(){
        String resposta = "";

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("(1) - Adicionar cliente - (2) Pesquisar cliente - (3) - Alterar informações cliente - (4) Excluir cliente - (5) Sair");

            resposta = scanner.nextLine();

            switch (resposta){
                case "1":
                    clientService.adicionarCliente(adicionarCliente());
                    break;
                case "2":
                    clientService.pesquisarCliente(pesquisarCliente());
                    break;
                case "3":
                    clientService.alterarCliente(pesquisarCliente(), alterarCliente());
                    break;
                case "4":
                    clientService.excluirCliente(excluirCliente());
                    break;
                case "5":
                    System.out.println("Sistema encerrado...");
                    break;
            }

        }while (!resposta.equals("5"));
    }


    public Client adicionarCliente(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Cpf: ");
        Long cpf = scanner.nextLong();

        Client client = new Client(nome, cpf);

        return client;
    }

    public Long pesquisarCliente(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o cpf do cliente: ");
        Long cpf = scanner.nextLong();

        return cpf;
    }

    public Client alterarCliente(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Novo nome: ");
        String NovoNome = scanner.nextLine();
        System.out.println("Novo cpf: ");
        Long NovoCpf = scanner.nextLong();

        Client cliente = new Client(NovoNome, NovoCpf);

        return cliente;
    }

    public Long excluirCliente(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cpf: ");
        Long cpf = scanner.nextLong();

        return cpf;

    }
}
