import java.util.Scanner;

public class exercicioModulo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n______________________________________\n");
        System.out.println("Olá! Bem vindo ao sistema Matriz!");
        System.out.println("______________________________________\n");

        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para [ " + i + " ][ " + j + " ]:");
                matriz[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calculando a soma dos elementos da matriz
        int sum = 0;
        int totalElementos = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += matriz[i][j];
                totalElementos++; // Conta o total de elementos para a média geral
            }
        }

        System.out.println("\nA soma dos elementos da matriz é: " + sum);

        // Cálculo da média dos valores gerais da matriz
        double mediaGeral = (double) sum / totalElementos;
        System.out.println("Média de todos os valores da matriz = " + mediaGeral);

        // Se o seu objetivo era calcular a média especificamente da LINHA UM (índice 0):
        int somaLinhaUm = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            somaLinhaUm += matriz[0][j];
        }
        double mediaLinhaUm = (double) somaLinhaUm / matriz[0].length;
        System.out.println("Média da soma da linha um = " + mediaLinhaUm);

        System.out.println("\nObrigado por utilizar o sistema!");
    }
}

