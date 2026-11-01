import java.util.Scanner;

class PrimeNumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int candidate = 2;

        for (int row = 1; row <= rows; row++) {
            for (int space = 0; space < rows - row; space++) {
                System.out.print("    ");
            }

            int count = 2 * row - 1;

            for (int column = 1; column <= count; column++) {
                while (!isPrime(candidate)) {
                    candidate++;
                }

                System.out.printf("%-4d", candidate);
                candidate++;
            }

            System.out.println();
        }

        scanner.close();
    }

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
