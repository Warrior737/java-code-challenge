package code.challenge.interviews;

import java.math.BigInteger;

public class PrimeNumbers {

    public static void main(String[] args) {
        int num1 = 17;
        int num2 = 49;
        int num3 = 1;

        String number17 = "17";
        String number49 = "49";
        String number1 = "1";

        System.out.println(num1 + " is prime: " + isPrime(num1)); // Output: 17 is prime: true
        System.out.println(num2 + " is prime: " + isPrime(num2)); // Output: 49 is prime: false
        System.out.println(num3 + " is prime: " + isPrime(num3)); // Output: 1 is prime: false

        System.out.println(number17 + " is prime: " + bigIntegerSolution(number17)); // Output: 17 is prime: true
        System.out.println(number49 + " is prime: " + bigIntegerSolution(number49)); // Output: 49 is prime: false
        System.out.println(number1 + " is prime: " + bigIntegerSolution(number1)); // Output: 1 is prime: false

    }

    public static boolean bigIntegerSolution(String n) {

        BigInteger bigInt = new BigInteger(n); // Convert string to BigInteger
        // Handle the special case of 1, which is not prime
        if (bigInt.equals(BigInteger.ONE)) {
           return false;
        } else {
            // Use isProbablePrime with a certainty value (e.g., 5)
            if (bigInt.isProbablePrime(5)) {
               return true;
            } else {
               return false;
            }
        }
    }

    public static boolean isPrime(int number) {
        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            return false;
        }
        // 2 is the only even prime number
        if (number == 2) {
            return true;
        }
        // Even numbers greater than 2 are not prime
        if (number % 2 == 0) {
            return false;
        }
        // Check for divisibility from 3 up to the square root of the number,
        // incrementing by 2 to only check odd divisors
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false; // Found a divisor, so it's not prime
            }
        }
        return true; // No divisors found, so it's prime
    }
}
