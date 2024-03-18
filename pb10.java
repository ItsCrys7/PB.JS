public class pb10 {

    public static void main(String[] args) {
        int n = 1001;

        while (!estePrim(n)) {
            n += 2;
        }

        System.out.println("Cel mai mic număr prim dupa 1000 este: " + n);
    }

    public static boolean estePrim(int numar) {
        if (numar <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numar); i++) {
            if (numar % i == 0) {
                return false;
            }
        }
        return true;
    }
}
