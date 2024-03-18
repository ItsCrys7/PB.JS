import java.util.Scanner;

public class pb11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceți un numar: ");
        int n = input.nextInt();
        input.close();

        if (n <= 0) {
            System.out.println("Numărul trebuie să fie mai mare decât 0.");
            return;
        }

        System.out.print("Toți divizorii numărului " + n + " sunt: 1");
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(", " + i);
            }
        }
        System.out.println(", " + n + ";");
    }
}
