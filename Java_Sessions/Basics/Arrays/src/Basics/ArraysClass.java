package Basics;

import java.util.Arrays;

public class ArraysClass {

    public static void main(String[] args) {

        //1D array
            int[] anArray = new int[5];
            System.out.println(anArray[3]); // default value is 0

            for (int i = 0; i < 5; i++)
                anArray[i] = i + 1;

            char[] charArray = new char[20];
            System.out.println(charArray[5]); //null character

        //2d array
            int[][] aTwoDArray = {
                    {2, 3, 9},
                    {5, 8, 6}
            };

            // address of reference to the 1D array
            System.out.println(aTwoDArray[1]);
            // access 2D array elements
            System.out.println(aTwoDArray[1][0]);

        //copying contents of array

            int[] copyArray = anArray.clone(); //different address
            for (int x : copyArray) {
                System.out.print(x + " ");
            }
            System.out.println();

            int[] copyUsingRange = Arrays.copyOfRange(anArray, 0, 3); // 0 to n-1

            for (int x : copyUsingRange) {
                System.out.print(x + " ");
            }
            System.out.println();

            System.out.println(copyArray + " " + anArray + " " + anArray + " " + copyUsingRange);

    }
}
