package questao1;

public class Main {
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            // Incrementa 'k' em 1
            k++;
            // Soma 'k' à variável 'soma'
            soma += k;
        }

        System.out.println(soma);
    }
}
