package slipp.net.hackersrank.eighth;

import java.util.Scanner;

/**
 * <p>This class is a solve of the
 * <a href="https://www.hackerrank.com/challenges/insertionsort1">
 * Insertion Sort - Part 1</a>.
 *
 * @author Daekwon Kang
 * @since 2016-05-11
 */
public class InsertionSort1 {
    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        final int lastIndex = ar.length - 1;
        int endOfArrayNumber = ar[lastIndex];
        int firstPopNumber = ar[lastIndex];

        for (int i = (lastIndex - 1); i > -1; --i) {
            if (ar[i] > endOfArrayNumber) {
                ar[i+1] = ar[i];
                printArray(ar);
            } else {
                ar[i+1] = endOfArrayNumber;
                endOfArrayNumber = ar[i];
            }

            if (i == 0) {
                if (ar[i] > firstPopNumber) {
                    ar[i] = firstPopNumber;
                }
                printArray(ar);
            }
        }
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
