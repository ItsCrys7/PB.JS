import java.util.Scanner;

public class pb7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduceți numarul de elemente: ");
        int n = scan.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Introduceti numarul " + (i + 1) + ": ");
            double num = scan.nextDouble();
            sum += num;
        }

        System.out.println("Media aritmetica este: " + (sum / n));

    }
}
