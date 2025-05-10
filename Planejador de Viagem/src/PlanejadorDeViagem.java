import java.util.Scanner;

public class PlanejadorDeViagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o orçamento disponível (em R$): ");
        double orcamento = sc.nextDouble();

        System.out.print("Digite o número de dias da viagem: ");
        int dias = sc.nextInt();

        System.out.print("Digite o tipo de destino(N para nacional, I para intercional): ");
        char destino = sc.next().toUpperCase().charAt(0);

        if (destino != 'N' && destino != 'I') {
            System.out.println("Destino inválido!");
        } else if ((orcamento >= 1000 && dias <= 7 && destino == 'N') || 
                   (orcamento >= 5000 && dias <= 14 && destino == 'I')) {
            System.out.println("Viagem viável!");
        } else {
            System.out.println("Viagem inviável!");
        }
    }
}
