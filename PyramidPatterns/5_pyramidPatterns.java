import java.util.Scanner;

class NumberLetterPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int space = 0; space < rows - row; space++) {
                System.out.print("    ");
            }

            int count = 2 * row - 1;

            for (int column = 1; column <= count; column++) {
                if (row % 2 == 1) {
                    System.out.printf("%-4d", row);
                } else {
                    char letter = (char) ('A' + row - 1);
                    System.out.printf("%-4c", letter);
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}
