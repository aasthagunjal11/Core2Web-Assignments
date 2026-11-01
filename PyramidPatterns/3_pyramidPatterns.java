import java.util.Scanner;

class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int space = 0; space < rows - row; space++) {
                System.out.print("    ");
            }

            for (int number = 1; number <= row; number++) {
                System.out.printf("%-4d", number);
            }

            for (int number = row - 1; number >= 1; number--) {
                System.out.printf("%-4d", number);
            }

            System.out.println();
        }

        scanner.close();
    }
}
