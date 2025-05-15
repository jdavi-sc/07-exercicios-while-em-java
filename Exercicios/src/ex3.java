import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = "";

        while (!senha.equals("1234")) {
            System.out.println("Digite uma senha: ");
            senha = sc.nextLine();
        }

        sc.close();
        System.out.println("Senha correta!!");
    }
}
