package questao2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entrada;

        // Recebe a entrada do usuário, caso o usuário não insira um número, gera um número aleatório entre 0 e 100
        System.out.println("Digite um número: ");
        try {
            entrada = scanner.nextInt();
        } catch (InputMismatchException e) {
            entrada = (int) (Math.random() * 101);
            System.out.println("Apenas números são aceitos! Verificando o número " + entrada + ":");
        }

        // Verifica se a entrada pertence a sequência chamando o método verificaFibonacci
        boolean pertenceAFibonacci = verificaFibonacci(entrada);

        if (pertenceAFibonacci) {
            System.out.println("O número está na sequência de Fibonacci.");
        } else {
            System.out.println("O número não está na sequência de Fibonacci.");
        }


    }

    // Retorna 'true' se a entrada estiver na sequência de Fibonacci, 'false' se não.
    public static boolean verificaFibonacci(int entrada) {
        int x = 0;
        int y = 1;
        int z;

        if (entrada == 0) {
            return true;
        }

        for (int i = 0; i < entrada; i++) {
            z = x + y;
            x = y;
            y = z;

            // Se ultrapassar o valor da entrada, sai do loop
            if (y >= entrada) {
                if (y == entrada) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
