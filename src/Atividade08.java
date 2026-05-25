import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        //8. Crie um programa que exiba um menu repetitivo com as opções:
        // 1 - Dizer "Olá"
        // 2 - Dizer "Tchau"
        // 3 - Encerrar
        // O menu deve continuar aparecendo até que o usuário escolha a opção 3.
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1. Dizer (Olá)");
            System.out.println("2. Dizer (Tchau)");
            System.out.println("3. Encerrar");
            System.out.print("Escolha alguma Opção: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Olá\n");
                    break;
                case 2:
                    System.out.println("Tchau\n");
                    break;
                case 3:
                    System.out.println("Finalizando...\n");
                    break;
            }
        }while(opcao != 3);

    }
}
