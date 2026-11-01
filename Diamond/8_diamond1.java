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

        char firstLetter = (char) ('A' + rows - row);
        char middleLetter = (char) ('A' + rows - 1);

        for (char letter = firstLetter; letter <= middleLetter; letter++) {
            System.out.print(letter + "   ");
        }

        for (char letter = (char) (middleLetter - 1); letter >= firstLetter; letter--) {
            System.out.print(letter);

            if (letter > firstLetter) {
                System.out.print("   ");
            }
        }

        System.out.println();
    }
}
