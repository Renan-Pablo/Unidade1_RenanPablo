import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        //7. Crie um programa que leia um número inteiro não-negativo e calcule seu fatorial
        //utilizando o laço for.
        //Exemplo: Entrada = 5 Saída = 120
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um númeroo inteiro não-negativo: ");
        int num = sc.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial de " + num + " é: " + fatorial);

    }
}
