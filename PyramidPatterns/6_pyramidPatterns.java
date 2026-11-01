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

            int value = rows - row + 1;
            int count = 2 * row - 1;

            for (int column = 1; column <= count; column++) {
                System.out.printf("%-4d", value);
            }

            System.out.println();
        }

        scanner.close();
    }
}
