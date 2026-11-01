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

            for (int number = row; number >= 1; number--) {
                System.out.printf("%-4d", rows - row + number);
            }

            for (int number = 2; number <= row; number++) {
                System.out.printf("%-4d", rows - row + number);
            }

            System.out.println();
        }

        scanner.close();
    }
}
