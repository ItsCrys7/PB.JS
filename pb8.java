import java.util.Scanner;

public class pb8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduceți n = ");
        int n = scan.nextInt();
        System.out.println();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorialul lui " + n + " = " + factorial);
    
    }
}
