import java.util.Scanner;

public class pb16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceți un număr: ");
        int n = input.nextInt();
        input.close();

        System.out.println("Cifrele numărului " + n + " sunt:");
        afisareCifre(n);
    }

    public static void afisareCifre(int n) {
        while (n > 0) {
            int cifra = n % 10;
            System.out.print(cifra + " ");
            n /= 10;
        }
        System.out.println();
    }
}
