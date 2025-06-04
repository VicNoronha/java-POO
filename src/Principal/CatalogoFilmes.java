package Principal;

import java.util.ArrayList;

public class CatalogoFilmes {

    public static void main(String[] args) {

        Filme filme1 = new Filme("O Poderoso Chefão", 175);
        Filme filme2 = new Filme("Matrix", 136);
        Serie serie1 = new Serie("Stranger Things", 5);
        Filme filme3 = new Filme("Interestelar", 169);
        Serie serie2 = new Serie("Breaking Bad", 5);

        // Criando um ArrayList de Titulos (polimorfismo)
        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(filme1);
        listaDeTitulos.add(filme2);
        listaDeTitulos.add(serie1); // Adicionando uma série
        listaDeTitulos.add(filme3);
        listaDeTitulos.add(serie2); // Adicionando outra série

        System.out.println("Percorrendo o ArrayList de Títulos:");

        // Percorrendo o ArrayList usando um loop foreach
        for (Titulo item : listaDeTitulos) {
            System.out.println("\nItem atual: " + item.getNome()); // Acessando o nome comum a todos os Títulos

            // Verificando se o item é uma instância de Filme antes de fazer o casting
            if (item instanceof Filme) {
                // Realizando o casting para Filme
                Filme filme = (Filme) item;
                System.out.println("  É um FILME!");
                // Agora podemos acessar métodos específicos de Filme
                System.out.println("  Duração do Filme: " + filme.getDuracaoEmMinutos() + " minutos.");
                System.out.println("  Detalhes (toString de Filme): " + filme.toString());
            } else if (item instanceof Serie) {
                // Verificando se é uma instância de Serie (para mostrar a diferença)
                Serie serie = (Serie) item;
                System.out.println("  É uma SÉRIE!");
                // Acessando métodos específicos de Serie
                System.out.println("  Temporadas da Série: " + serie.getTemporadas());
                System.out.println("  Detalhes (toString de Série): " + serie.toString());
            } else {
                System.out.println("  Não é nem Filme nem Série (é apenas um Título genérico).");
            }
        }
    }
}
