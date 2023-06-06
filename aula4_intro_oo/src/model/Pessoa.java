package model;

public abstract class Pessoa {
    protected short codigo;
    protected String nome;
    protected String cpf;
    protected String email;

    protected Pessoa(short codigo,String nome,String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
    }

    // Métodos assessores
    // Getters
    public short getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getEmail() {
        return this.email;
    }

    // Setters
    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
