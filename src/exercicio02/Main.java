package exercicio02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public  static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("0.000");
        Scanner sc = new Scanner(System.in);
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        //entrada de dados
        System.out.println("Informe as coorenadas do ponto 1 ");
        p1.x = sc.nextInt();
        p1.y = sc.nextInt();
        System.out.println();
        System.out.println("Informe as coorenadas do ponto 2 ");
        p2.x = sc.nextInt();
        p2.y = sc.nextInt();

        //impressao da distancia entre dois pontos
        System.out.println();
        System.out.println("Distancia de p1 para p2: " + formato.format(p1.calcularDistancia(p2)));
        System.out.println("Distancia de p2 para p1: " + formato.format(p2.calcularDistancia(p1)));

        //impressao da distancia de cada ponto ate a origem
        System.out.println();
        System.out.println("Distancia de p1 para p2: " + formato.format(p1.calcularDistancia(p2)));
        System.out.println("Distancia de p2 para p1: " + formato.format(p2.calcularDistancia(p1)));

        //impressao do ponto mais proximo da origem
        System.out.println();
        Ponto aux =p1.maisProximoDaOrigem(p1,p2);
        System.out.println(aux.formatarPonto());



    }



}
