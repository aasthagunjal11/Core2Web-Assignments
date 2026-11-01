import java.util.Scanner;

class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20, 21, 24, 27};
        int index = 0;

        for (int row = 1; row <= rows; row++) {
            for (int space = 0; space < rows - row; space++) {
                System.out.print("    ");
            }

            int count = 2 * row - 1;

            for (int column = 1; column <= count && index < values.length; column++) {
                System.out.printf("%-4d", values[index]);
                index++;
            }

            System.out.println();
        }

        scanner.close();
    }
}
