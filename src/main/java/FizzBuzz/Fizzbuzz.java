package FizzBuzz;

public class Fizzbuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0 & i % 3 == 0) {
                System.out.println("FizzBuzz " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            } else if (i % 3 != 0) {
                System.out.println(i);
            } else if (i % 5 != 0) {
                System.out.println(i);
            } else if (i % 5 != 0 & i % 3 != 0) {
                System.out.println(i);
            }
        }
    }
}