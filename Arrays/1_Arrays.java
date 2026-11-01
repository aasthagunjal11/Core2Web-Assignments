/*1. Write a program to print the array with minimum 10 elements data.
Example: 
Array: 
10  20  30  40  50  60  70  80  90  100
Output :
10, 20, 30, 40, 50, 60, 70, 80, 90, 100 */

class PrintArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
	System.out.println();
    }
}
