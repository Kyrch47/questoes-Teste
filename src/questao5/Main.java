package questao5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe a entrada do usuário
        String entrada = scanner.nextLine();

        char[] arrayCaracteres = new char[entrada.length()];

        // Transforma a entrada em um array de caracteres, já invertendo as posições
        for (int i = 0; i < entrada.length(); i++) {
            arrayCaracteres[i] = entrada.charAt(entrada.length() - i - 1);
        }

        // Transforma o array de char em uma string
        String textoReverso = Arrays.toString(arrayCaracteres);

        // Remove os caracteres "[", "]" e ", " que vieram do passo anterior
        String textoFinal = textoReverso.replaceAll("[\\[\\], ]", "");

        System.out.println("A string reversa é: " + textoFinal);
    }
}
