public class PerfectNumber {

    public static boolean isPerfect(int number) {
        if (number <= 1) {
            return false;
        }
        int sum = 1; 
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
                if (i * i == number) {
                    sum -= i;
                }
            }
        }
        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
}
