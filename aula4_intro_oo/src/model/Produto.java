package model;

import java.time.LocalDate;

public class Produto {
    private String sku;
    private String codigoDeBarra;
    private String nome;
    private float preco;
    private LocalDate dataDeValidade;

    public Produto(String sku, String nome, float preco) {
        this.sku = sku;
        this.nome = nome;
        this.preco = preco;
    }

    public String getSku() {
        return sku;
    }

    public String getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(String codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(LocalDate dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}