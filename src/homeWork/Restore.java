package homeWork;

import java.util.Scanner;

public class Restore {

    public static void restoreArray(int[] array) {

        if (array[0] < 0 || array[array.length - 1] < 0) {
            System.out.println();
            System.out.println("First or last array element is a negative number, this array cannot be fixed!");
        }

        for (int i = 1; i < array.length - 1; i++) {
            if (i + 1 == array.length - 1 & array[i] > 0) {
                System.out.println("No negative numbers in the array, nothing to fix!");
                getArray(array);
            }
            if (array[i] < 0) {
                fixArray(array);
                break;
            }
        }
    }

    private static void fixArray(int[] array) {

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < 0 && array[i + 1] < 0) {
                System.out.println("There are 2 or more consecutive negative numbers in the array, it cannot be fixed!");
            } else if (array[i] < 0 && array[i - 1] +1 == array[i + 1]) {
                array[i] = array[i + 1];
            } else if (array[i] < 0) {
                array[i] = (array[i - 1] + array[i + 1]) / 2;
            }
        }
        getArray(array);
    }

    private static void getArray(int[] array) {
        System.out.println();
        System.out.print("Restored array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int arrLength;

        while (true) {
            System.out.print("Please enter array length: ");
            if (input.hasNextInt()) {
                arrLength = input.nextInt();
                if (arrLength > 1) {
                    break;
                } else {
                    System.out.println("Incorrect input!");
                    System.out.println();
                }
            } else {
                System.out.println("Incorrect input!");
                System.out.println();
                input.nextLine();
            }
        }

        int[] array = new int[arrLength];

        for (int i = 0; i < array.length; ) {
            while (true) {
                System.out.print("Please enter array element [" + (i) + "]: ");
                if (input.hasNextInt()) {
                    array[i] = input.nextInt();
                    i++;
                    break;
                } else {
                    System.out.println("Incorrect input!");
                    input.nextLine();
                }
            }
        }

        System.out.println();
        System.out.print("Source array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        restoreArray(array);
    }
}
