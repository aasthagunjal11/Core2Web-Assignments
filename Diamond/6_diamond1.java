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

        for (int number = 1; number <= row; number++) {
            System.out.print(number);
            if (number < row || row > 1) {
                System.out.print("   ");
            }
        }

        for (int number = row - 1; number >= 1; number--) {
            System.out.print(number);
            if (number > 1) {
                System.out.print("   ");
            }
        }

        System.out.println();
    }
}
