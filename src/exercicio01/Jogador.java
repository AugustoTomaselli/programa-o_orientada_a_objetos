package exercicio01;

public class Jogador {
    String nome;
    int[] pontos = new int[3];
}

//metodos pontuação
public int calcularPontosTotal() {
    int total = 0;
    for (int i : pontos) {
        total+=i;
    }
    return total;

}

