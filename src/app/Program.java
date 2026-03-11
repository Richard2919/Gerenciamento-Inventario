package app;

import entity.Estoque;
import entity.Produto;

public class Program {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        estoque.adicionar(new Produto(1, "teclado mecanico ", 10, 250.0));
        estoque.adicionar(new Produto(2, "mouse gamer ", 3, 260.0));
        estoque.adicionar(new Produto(3, "cadeira gamer ", 2, 750.0));

        System.out.println("--------------");

        System.out.println("Produto com estoque baixo");
        estoque.obterAlertas().forEach(p -> System.out.println("ALERTA: " + p.getName()));

    }
}
