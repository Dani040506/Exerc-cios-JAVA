import java.util.Scanner;

public class SelecaoDeAstrounautas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do candidato: ");
        int idade = sc.nextInt();

        System.out.print("Digite o número de missões anteriores: ");
        int missoes = sc.nextInt();

        System.out.print("Possui certificação médica? (s/n): ");
        char certificacao = sc.next().toLowerCase().charAt(0);

        if (idade >= 25 && idade <= 40 && (certificacao == 's' || missoes >= 2)) {
            System.out.println("Candidato aprovado!");
        }else {
            System.out.println("Candidato reprovado!");
        }
    }
}
