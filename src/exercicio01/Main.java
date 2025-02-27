package exercicio01;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador jogador = new Jogador();

        System.out.println("Digite o nome do jogador");
        jogador.nome = sc.nextLine();

        for (int i=0 ; i<3; i++) {
            System.out.println("Digite a pontuação do jogador na primera rodada : ");
            Jogador.pontos = sc.nextInt();

        }

    }
}
