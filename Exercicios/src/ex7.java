import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int i = 0, soma = 0;

        while (i < 10) {
            System.out.println("Digite um número: ");
            soma += sc.nextInt();
            i++;

            
        }
        
        System.out.println("Soma: " + soma);
        sc.close();
    }
}