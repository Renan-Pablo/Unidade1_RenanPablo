import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        // 3. Implemente um programa que exiba um menu com 3 opções:
        //     1 - Somar dois números
        //     2 - Subtrair dois números
        //     3 - Sair
        //     O programa deve usar switch para executar a operação escolhida.
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU INTERATIVO");
        System.out.println("1. Somar dois números.");
        System.out.println("2. Subtrair dois números.");
        System.out.println("3. Sair");
        System.out.print("Escolha: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("n1: ");
                int n1 = sc.nextInt();
                System.out.print("n2: ");
                int n2 = sc.nextInt();
                System.out.println("Soma: " + (n1 + n2));
                break;
            case 2:
                System.out.print("n1: ");
                n1 = sc.nextInt();
                System.out.print("n2: ");
                n2 = sc.nextInt();
                System.out.println("Subtração: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }

    }
}
