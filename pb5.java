import java.util.Scanner;

public class pb5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int sum = 0;
        int nrPar = 2;

        for(int i=05; i<n; i++)
        {
            sum = sum + nrPar;
            nrPar = nrPar +2;
        }
        System.out.println(sum);
    }
}