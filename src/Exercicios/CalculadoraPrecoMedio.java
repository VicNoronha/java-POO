package Exercicios;
import java.util.ArrayList;

public class CalculadoraPrecoMedio {

    public static void main(String[]args){
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(new Produto("Banana", 5.99));
        listaDeProdutos.add(new Produto("maca", 2.99));
        listaDeProdutos.add(new Produto("pera", 4.99));
        listaDeProdutos.add(new Produto("melancia", 7.99));

        double somaDosPrecos = 0.0; //inicializando uma variável

        System.out.println("Lista de Produtos:");
        for(Produto produto : listaDeProdutos){
            System.out.println(produto);
            somaDosPrecos+=produto.getPreco();
        }

        double precoMedio = 0.0;
        if(!listaDeProdutos.isEmpty()){
            precoMedio=somaDosPrecos/listaDeProdutos.size();
        }
        System.out.println("---------------------- ");
        System.out.println(" A soma total dos produtos é R$"+String.format("%.2f",somaDosPrecos));
        System.out.println("Preco médio dos produtos: "+ String.format("%.2f",precoMedio));

    }
}