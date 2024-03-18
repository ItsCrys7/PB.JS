import java.util.Scanner;

public class pb12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceți un număr: ");
        int n = input.nextInt();
        input.close();

        if (n <= 0) {
            System.out.println("Numărul trebuie să fie mai mare decât 0.");
            return;
        }

        System.out.print("Toți divizorii primi ai numărului " + n + " sunt: ");
        for (int i = 2; i <= n / 2; i++) {
            boolean prim = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prim = false;
                    break;
                }
            }
            if (prim && n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
