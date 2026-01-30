import java.util.*;
class Prime {
    public static void main(String[] args) {
        int n = 5;
        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        System.out.println("Prime");
    }
}
