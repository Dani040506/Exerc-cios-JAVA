import java.util.Scanner;

public class FiltroDeMensagens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento da mensagem (número de caracteres): ");
        int comprimento = sc.nextInt();

        System.out.print("Digite a quantidade de palavras proibidas: ");
        int proibidas = sc.nextInt();

        System.out.print("Digite o tom da mensagem (P para positivo, N para negativo): ");
         char tom = sc.next().toUpperCase().charAt(0);

         if (tom != 'P' && tom != 'N') {
            System.out.println("Tom inválido!");
         } else if (comprimento <= 280 && proibidas == 0 && tom == 'P') {
            System.out.println("Mensagem aceita!");
         } else {
            System.out.println("Mensagem bloqueada!");
         }
    }
}
