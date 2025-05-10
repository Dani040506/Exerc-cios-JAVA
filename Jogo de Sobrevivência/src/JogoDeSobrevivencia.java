import java.util.Scanner;

public class JogoDeSobrevivencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nível de energia (0 a 100): ");
        int energia = sc.nextInt();

        System.out.print("Digite a quantidade de água (em litros): ");
        double agua = sc.nextDouble();

        System.out.print("Digite a quantidade de comida (em kg): ");
        double comida = sc.nextDouble();

        if (energia < 30 && (agua >= 1 || comida >= 0.5)) {
            System.out.println("Ação escolhida: Descansar");
        }else if (energia >= 30 && agua >= 2 && comida >= 1) {
            System.out.println("Ação escolhida: Explorar");
        }else if (energia >= 50 && agua >= 3 && comida >= 1) {
            System.out.println("Ação escolhida: consstruir");
        }else {
            System.out.println("Nenhuma ação possível");
        }
     
    }
}
