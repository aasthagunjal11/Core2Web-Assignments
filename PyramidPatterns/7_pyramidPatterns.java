import java.util.Scanner;

class AlphabetPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int space = 0; space < rows - row; space++) {
                System.out.print("    ");
            }

            char firstLetter = (char) ('A' + rows - row);
            char middleLetter = (char) ('A' + rows - 1);

            for (char letter = firstLetter; letter <= middleLetter; letter++) {
                System.out.printf("%-4c", letter);
            }

            for (char letter = (char) (middleLetter - 1);
                 letter >= firstLetter; letter--) {
                System.out.printf("%-4c", letter);
            }

            System.out.println();
        }

        scanner.close();
    }
}
