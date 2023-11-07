package SimpleNumber;

import java.util.Scanner;

public class SimpleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        boolean isPrime = true;
        double squareRoot = Math.sqrt(number) + 2;
        int i = 2;
        while (i <= squareRoot && isPrime) {
            if (number % i == 0) isPrime = false;
            i++;
        }
        System.out.print(isPrime ? (number + " простое") : " составное");
    }
}