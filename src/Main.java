
public class Main {
    public static void main(String[] args) {
       for (int i = 2; i <= 100; i++) {
           if (isAsal(i)) {
               System.out.print(i + " ");
           }
       }
    }

    public static boolean isAsal(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}