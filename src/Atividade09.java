import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        //9. Faça um programa que leia o nome completo de uma pessoa e mostre o primeiro
        //nome e o último nome separadamente.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomeCompleto = sc.nextLine();

        String[] nomeCortado = nomeCompleto.split(" ");
        String primeiroNome = nomeCortado[0];
        String ultimoNome = nomeCortado[nomeCortado.length - 1];

        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Ultimo nome: " + ultimoNome);
    }
}
