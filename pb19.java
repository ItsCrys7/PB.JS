import java.util.Scanner;

public class pb19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceți un număr: ");
        int n = input.nextInt();
        input.close();

        int invers = inversulNumarului(n);

        System.out.println("Inversul numărului " + n + " este: " + invers);
    }

    public static int inversulNumarului(int n) {
        int invers = 0;
        while (n > 0) {
            int cifra = n % 10;
            invers = invers * 10 + cifra;
            n /= 10;
        }
        return invers;
    }
}
