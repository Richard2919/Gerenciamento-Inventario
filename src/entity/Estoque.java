package entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Estoque{
    private Map<Integer, Produto> produtos = new HashMap<>();

    public void adicionar(Produto produto){
        if(produtos.containsKey(produto.getId())){
             throw new IllegalArgumentException("Error: produto com ID" + produto.getId() + " já existente");
        }else {
            produtos.put(produto.getId(), produto);
            System.out.println("Produto adicionado com sucesso " + produto.getName());
        }
    }

    public List<Produto> obterAlertas(){
        return produtos.values().stream().filter(produto -> produto.getquantity() < 5).collect(Collectors.toList());
    }

    public List<Produto> buscarPorNome(String termo){
        return produtos.values().stream().filter(produto -> produto.getName().toLowerCase().contains(termo.toLowerCase()))
                .collect(Collectors.toList());
    }

    public void buscaPorID(int idProcurado){
        Produto produto = produtos.get(idProcurado);
        if (produto != null){
            System.out.println("Produto encontrado" + produto.getName());
        }else {
            System.out.println("Erro: produto com id " + idProcurado + " não exite");
        }
    }

}
