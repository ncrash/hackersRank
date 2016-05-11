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
        int lastIndex = ar.length - 1;
        int num = ar[lastIndex];
        lastIndex--;
        while (lastIndex >= 0 && ar[lastIndex] > num) {
            ar[lastIndex + 1] = ar[lastIndex];
            lastIndex--;
            printArray(ar);
        }
        ar[lastIndex + 1] = num;
        printArray(ar);
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
