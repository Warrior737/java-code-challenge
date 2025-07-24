package code.challenge.interviews;

public class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            // Check for divisibility by both 3 and 5 first
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check for divisibility by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check for divisibility by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}
