package view;

import model.Cliente;
import model.Item;
import model.Produto;
import model.Venda;
import model.Vendedor;

public class App {
    public static void main(String[] args) throws Exception {
        Vendedor paulo = new Vendedor(
                (short) 22,
                "Paulo Gilberto da Silva",
                "646.982.760-80");
        Cliente norberto = new Cliente(
                (short) 44,
                "Norberto de Almeida Bitenncourt",
                "094.623.470-18");

        Item item = new Item(
                new Produto(
                        "ABC123",
                        "Trakinas sabor Banana",
                        3.5f),
                (byte) 5);

        Venda venda = new Venda(paulo, norberto);

        System.out.printf("Vendedor: %s%n Cliente: %s", venda.getVendedor().getNome(), venda.getComprador().getNome());
    }
}
