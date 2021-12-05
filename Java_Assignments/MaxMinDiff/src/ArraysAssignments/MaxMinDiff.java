import java.util.Scanner;

/*Question

1D Array Assignment I

Write a program to find the range of the elements in the array. The range of an array is the difference between the maximum and minimum element in an array.

Input : The first integer corresponds to n and the next n integers correspond to the elements in the array.
Output : Range value

Case 1:
    Input
    5
    2
    4
    1
    3
    5
    Output
    4

Case 2:
    Input
    3
    5
    6
    4
    Output
    2
*/

public class MaxMinDiff {

    public static int diffMaxMin(int[] arr, int num) {

        int min = arr[0], max = arr[0];

        for (int i = 1; i < num; i++) {

            if (arr[i] < min)
                min = arr[i];

            if (arr[i] > max)
                max = arr[i];
        }

        return max - min;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }

        if (num < 2)
            System.out.println("At least two numbers are needed");
        else
            System.out.println(diffMaxMin(arr, num));
    }
}