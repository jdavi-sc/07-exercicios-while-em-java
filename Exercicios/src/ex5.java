import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int secreto = 7;
        int palpite;

        do {
            System.out.println("Adivinhe o número (entre 1 e 10): ");
            palpite = sc.nextInt();
        } while (palpite != secreto);

        System.out.println("Você acertou!");

        sc.close();
    }
}