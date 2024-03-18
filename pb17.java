import java.util.Scanner;

public class pb17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceți un număr: ");
        int n = input.nextInt();
        input.close();

        System.out.println("Cifră maximă a numărului " + n + " este: " + gasesteCifraMaxima(n));
    }

    public static int gasesteCifraMaxima(int n) {
        if (n <= 0) {
            return -1;
        }
        
        int cifraMaxima = 0;
        while (n > 0) {
            int cifra = n % 10;
            cifraMaxima = Math.max(cifraMaxima, cifra);
            n /= 10;
        }
        return cifraMaxima;
    }
}
