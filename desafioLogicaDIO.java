import java.util.Scanner;

public class desafioLogicaDIO {
    public static void main(String[] args) throws Exception{
        // abre o scanner
        Scanner caixaDeTexto = new Scanner(System.in);
        // recebe o nome do heroi
        System.out.println("Digite o nome do heroi: ");
        String nomeHeroi = caixaDeTexto.nextLine();
        // recebe a experiência do herói
        System.out.println("Digite a quantidade de Experiência(XP) do seu heroi: ");
        double nivel = caixaDeTexto.nextDouble();
        // tratamento dos dados
        if (nivel <= 1000) {
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Ferro");
        }
        else if (nivel > 1000 && nivel <= 2000) {
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Bronze");
        }
        else if (nivel > 2000 && nivel <= 5000) {
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível Prata");
        }
        else if (nivel > 5000 && nivel <= 7000) {
            System.out.println("O herói de nome " + nomeHeroi + " está no nível Ouro");
        }
        else if (nivel > 7000 && nivel <= 8000) {
            System.out.println("O herói de nome " + nomeHeroi + " está no nível Platina");
        }
        else if (nivel > 8000 && nivel <= 9000) {
            System.out.println("O herói de nome " + nomeHeroi + " está no nível Ascendente");
        } else if (nivel > 9000 && nivel <= 10000) {
            System.out.println("O heroi de nome " + nomeHeroi + " está no nível Imortal");
        }
        else {
            System.out.println("O heroi de nome " + nomeHeroi + " está no nivel Radiante");
        }
        // fecha o scanner
        caixaDeTexto.close();
    }
}