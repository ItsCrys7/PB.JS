import java.util.Scanner;

public class pb4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int o = scan.nextInt();

        if (n<m && n<o) {
            System.out.println(n);
        }
        if (m<n && m<o) {
            System.out.println(m);
        }
        if (o<n & o<m) {
            System.out.println(o);
        }
    }
}
