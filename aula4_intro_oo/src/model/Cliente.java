package model;

public class Cliente extends Pessoa {
    private float pontosDeFidelidade;

    public Cliente(short codigo, String nome, String cpf) {
        super(codigo, nome, cpf); // Pessoa()
        this.pontosDeFidelidade = 20;
    }

    public float getPontosDeFidelidade() {
        return this.pontosDeFidelidade;
    }

    public void setPontosDeFidelidade(float pontosDeFidelidade) {
        this.pontosDeFidelidade = pontosDeFidelidade;
    }
}
