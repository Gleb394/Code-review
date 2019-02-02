package homeWork;

import java.util.Scanner;

public class Rotation {

    public static void rotationArray(int[] array, int k) {
        int tmp;
        for (int i = 0; i < k; i++) {
            tmp = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = tmp;
        }

        System.out.println();
        System.out.print("Rotated array: ");
        for (int i : array) {
            System.out.print(i + " ");
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

        int[] array = new int [arrLength];
        int k;

        // Verified k amount input
        while (true) {
            System.out.print("Please enter first k elements amount from 1 to " + (arrLength - 1) + " inclusively: ");
            if (input.hasNextInt()) {
                k = input.nextInt();
                if (k > 0 && k < arrLength) {
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

        // Source array output
        System.out.println();
        System.out.print("Source array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        rotationArray(array, k);
    }
}
