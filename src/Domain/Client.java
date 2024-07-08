package Domain;

public class Client {
    String nome;
    Long cpf;

    public Client(String nome, Long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
