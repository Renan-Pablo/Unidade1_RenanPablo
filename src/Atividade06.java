import java.util.ArrayList;
import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        //6. Crie um array com os seguintes nomes: "Maria", "João", "Carlos", "Ana", "Beatriz". Em
        //seguida, peça um nome ao usuário e diga se ele está ou não no array.

        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Carlos");
        nomes.add("Ana");
        nomes.add("Beatriz");

        System.out.print("Digite algum nome: ");
        String nome = sc.next();

        if (nomes.contains(nome)){
            System.out.println("Esse nome já está no Array");
        }else {
            System.out.println("Esse nome não está no Array");
        }



    }
}
