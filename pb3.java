import java.util.Scanner;

public class pb3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        if (n%2 == 0 && m%2 == 0) {
            System.out.println((n+m)/2);
        }
        if (n%2 == 1 && m%2 == 1) {
            System.out.println(n*m);
        }
        if(n%2 == 0 && m%2 ==1){
            System.out.println(n+m);
        }
        if(n%2 == 1 && m%2 ==0){
            System.out.println(n+m);
        }

    }
}
