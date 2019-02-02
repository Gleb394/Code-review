package homeWork;

import java.util.Scanner;

public class Ranges {

    static void rangesArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print("[" + array[i] + "]");
                break;
            }
            if (array[i] + 1 != array[i + 1]) {
                System.out.print("[" + array[i] + "]");
            } else {
                System.out.print("[" + array[i]);
                while (i < array.length - 1) {
                    if (array[i] + 1 == array[i + 1]) {
                        i++;
                    } else {
                        break;
                    }
                }
                System.out.print(" " + array[i] + "]");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrLength;

        // Verified array length input
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

        // Verified array elements input
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

        System.out.print("Ranges: ");

        rangesArray(array);
    }
}