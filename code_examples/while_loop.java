public class SmallestDivisor {
    public static void main(String[] args) {

        int num = 15;
        int divisor = 2;

        while (num % divisor != 0) {
            divisor += 1;
        }
        System.out.println("Smallest divisor of " + num + " is " + divisor);

    }
}