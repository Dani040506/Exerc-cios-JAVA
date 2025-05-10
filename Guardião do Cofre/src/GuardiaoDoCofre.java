import java.util.Scanner;

public class GuardiaoDoCofre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código númerico: ");
        int codigo = sc.nextInt();

        System.out.print("Digite o nível de segurança (1 a 5): ");
        int nivel = sc.nextInt();

        System.out.print("Digite a chave especial (A, B ou C): ");
        char chave = sc.next().toUpperCase().charAt(0);

        if (nivel < 1 || nivel > 5 || (chave != 'A' && chave != 'B' && chave != 'C')) {
            System.out.println("Entrada inválida!");
        } else if ((codigo % 7 == 0 && nivel >= 3) || chave == 'A') {
            System.out.println("Cofre aberto!");    
        } else {
            System.out.println("Acesso negado!");
        }
    
    }
}
