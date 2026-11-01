import java.util.Scanner;

class AlphabetDiamond {
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

        char letter = (char) ('a' + row - 1);
        int count = 2 * row - 1;

        for (int column = 1; column <= count; column++) {
            System.out.print(letter);
            if (column < count) {
                System.out.print("   ");
            }
        }

        System.out.println();
    }
}
