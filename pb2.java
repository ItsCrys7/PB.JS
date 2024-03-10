import java.util.Scanner;

public class pb2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();

        if (n>=1 && n<=5) {

            if (n==1) {
                System.out.println("U-N-U");
            }
            if (n==2) {
                System.out.println("D-O-I");
            }
            if (n==3) {
                System.out.println("T-R-E-I");
            }
            if (n==4) {
                System.out.println("P-A-T-R-U");
            }
            if (n==5) {
                System.out.println("C-I-N-C-I");
            }
        }
        else
        System.out.println("INVALID");
    }
}
