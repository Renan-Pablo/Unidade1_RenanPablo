import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        //4. Crie um programa que leia um número inteiro do usuário e imprima a tabuada
        //desse número (de 1 a 10), usando um laço for.
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para saber sua tabuada: ");
        int num = sc.nextInt();

        System.out.println("Tabuada do " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
