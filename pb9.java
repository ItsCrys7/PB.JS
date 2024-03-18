import java.util.Scanner;

public class pb9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceți un număr diferit de 0 sau 1: ");
        int n = input.nextInt();
        System.out.println();

        boolean prim = true;
        
        if (n > 1) {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prim = false;
                    break;
                }
            }
            if (prim) {
                System.out.println("Numărul " + n + " este prim.");
            } else {
                System.out.println("Numărul " + n + " nu este prim.");
            }
        } else {
            System.out.println("Numărul trebuie să fie mai mare decât 1.");
        }
        
        input.close();
    }
}
