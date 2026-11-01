import java.util.Scanner;

class NumberDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            printRow(row, rows);
        }

        for (int row = rows - 1; row >= 1; row--) {
            printRow(row, rows);
        }

        scanner.close();
    }

    static void printRow(int row, int rows) {
        for (int space = 0; space < rows - row; space++) {
            System.out.print("    ");
        }

        for (int number = row; number <= 2 * row - 1; number++) {
            System.out.print(number + "   ");
        }

        for (int number = 2 * row - 2; number >= row; number--) {
            System.out.print(number);

            if (number > row) {
                System.out.print("   ");
            }
        }

        System.out.println();
    }
}
