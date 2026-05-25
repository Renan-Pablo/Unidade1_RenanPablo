public class Atividade05 {
    public static void main(String[] args) {
        //5. Faça um programa que leia uma string e substitua todas as ocorrências da letra "e"
        //por "*".

        String mensagem = "Olá meu nome é Renan Pablo, estou testando alguns comandos de string.";
        String mensagemAlterada = mensagem.replace("e", "*");

        System.out.println("Mensagem antiga: "+ mensagem);
        System.out.println("Mensagem alterada: "+ mensagemAlterada);
    }
}
