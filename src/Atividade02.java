public class Atividade02 {
    public static void main(String[] args) {

        //2. Escreva um programa que mostre na tela os tipos de dados primitivos em Java
        //com seus valores atribuídos.

        // Inteiros
        byte valorByte = 1;
        short valorShort = 22;
        int valorInt = 150;
        long valorLong = 2000L;

        // Reais/Ponto flutuante
        float valorFloat = 25.55f;
        double valorDouble = 123.45;

        // Caracteres
        char valorChar = 'M';

        // Lógicos
        boolean valorBoolean = true;

        System.out.println("\nInteiros:");
        System.out.println("Valor em byte: "+ valorByte);
        System.out.println("Valor em short: "+ valorShort);
        System.out.println("Valor em int: "+ valorInt);
        System.out.println("Valor em long: "+ valorLong);

        System.out.println("\nReais/Ponto flutuante:");
        System.out.println("Valor em float: "+ valorFloat);
        System.out.println("Valor em double: "+ valorDouble);

        System.out.println("\nCaracteres:");
        System.out.println("Valor em char: "+ valorChar);

        System.out.println("\nLógicos:");
        System.out.println("Valor em boolean: "+ valorBoolean);

    }
}
