import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner (System.in);

        int num, soma = 0;

        do {
            System.out.println("Digite um número (0 para sair): ");
            num = sc.nextInt();
            soma += num;
        } while  (num != 0);
        System.out.println("Soma total: " + soma);

        sc.close();
    }
}