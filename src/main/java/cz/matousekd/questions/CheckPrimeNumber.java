package cz.matousekd.questions;

/**
 * Created by David.Matousek on 24.7.2015.
 */
public class CheckPrimeNumber {

    private static int number = 3;

    public static void main(String[] args) {

        System.out.println(isPrime(number, number-1));

    }

    private static boolean isPrime(int number, int divisor) {
        if(number == 1){
            return false;
        }
        else if (divisor == 1) {
            return true;
        } else if (number % divisor != 0) {
            return isPrime(number, divisor - 1);
        } else {
            return false;
        }
    }

}
