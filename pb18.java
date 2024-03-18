import java.util.Scanner;

public class pb18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceți un număr: ");
        int n = input.nextInt();
        input.close();

        int cifraMinima = gasesteCifraMinima(n);

        System.out.println("Cifra minimă a numărului " + n + " este: " + cifraMinima);
    }

    public static int gasesteCifraMinima(int n) {
        if (n == 0) {
            return 0;
        }
        
        int cifraMinima = Integer.MAX_VALUE;
        while (n > 0) {
            int cifra = n % 10;
            cifraMinima = Math.min(cifraMinima, cifra);
            n /= 10;
        }
        return cifraMinima;
    }
}
