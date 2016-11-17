/**
 * Created by opilane on 17.11.2016.
 */
public class exercise62 {
    public static void main(String[] args) {
        System.out.println(isDivisible(20, 3));
    }

    public static boolean isDivisible(int n, int m) {
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }
    }
}

