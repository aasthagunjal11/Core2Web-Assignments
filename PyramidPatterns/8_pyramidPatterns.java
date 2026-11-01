import java.util.Scanner;

class OddNumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int space = 0; space < rows - row; space++) {
                System.out.print("    ");
            }

            for (int value = 1; value <= 2 * row - 1; value += 2) {
                System.out.printf("%-4d", value);
            }

            for (int value = 2 * row - 3; value >= 1; value -= 2) {
                System.out.printf("%-4d", value);
            }

            System.out.println();
        }

        scanner.close();
    }
}
