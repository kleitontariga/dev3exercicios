package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int codigo;
    private LocalDate dataDaVenda;
    private List<Item> itens;
    private Vendedor vendedor;
    private Pessoa comprador;

    public Venda(int codigo, Vendedor vendedor, Pessoa comprador) {
        this.codigo = codigo;
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.dataDaVenda = LocalDate.now();
        this.itens = new ArrayList<Item>();
    }

    public Venda(int codigo, Vendedor vendedor, Pessoa comprador, LocalDate dataDaVenda) {
        this.codigo = codigo;
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.dataDaVenda = dataDaVenda;
        this.itens = new ArrayList<Item>();
    }

    public Venda(Vendedor vendedor, Pessoa comprador) {
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.dataDaVenda = LocalDate.now();
        this.itens = new ArrayList<Item>();
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getDataDaVenda() {
        return dataDaVenda;
    }

    public List<Item> getItens() {
        return itens;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Pessoa getComprador() {
        return comprador;
    }
}
