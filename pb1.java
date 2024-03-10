import java.util.Scanner;

public class pb1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();

        if (n>5 && n <=10) {
            System.out.println("Admis");
        }
        if (n>1 && n<5) {
            System.out.println("Respins");
        }
        if (n<1 || n>10) {
            System.out.println("Invalid");
        }
    }
}