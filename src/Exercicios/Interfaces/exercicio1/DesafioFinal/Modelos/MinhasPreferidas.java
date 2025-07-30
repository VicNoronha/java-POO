package Exercicios.Interfaces.exercicio1.DesafioFinal.Modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){

        if (audio.getClassificacao() >= 9){

            System.out.println(audio.getTitulo() + " é um SUCESSO absoluto, vale a pena ouvir!");
        } else {
            // CORRIGIDO: Mensagem mais alinhada com a condição de não ser um "sucesso absoluto"
            System.out.println(audio.getTitulo() + " é ótimo, mas ainda não atingiu o nível de popularidade para ser um sucesso absoluto.");

        }
    }
}