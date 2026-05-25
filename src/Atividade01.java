public class Atividade01 {
    public static void main(String[] args) {
        // 1. Escreva um programa Java que use os operadores lógicos para vericar se um
        //número está entre 10 e 20 (inclusive). Use int numero = 15;
        int numero = 20;

        if (numero > 10 && numero < 20) {
            System.out.println("Número: " + numero + " está entre 10 e 20.");
        } else {
            System.out.println("Número: " + numero + " não está entre 10 e 20.");
        }
    }
}
