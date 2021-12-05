package ArraysAssignments;

import java.util.Scanner;

/*Question

    Write a program to find the type of array using functions. An array is said to be “Even” if all the elements in the array are even. An array is said to be “Odd” if all the elements in the array are odd. An array is said to be “Mixed” if it contains some odd elements and some even elements. The return value of the function should be 1 if the array is Even. The return value of the function should be 2 if the array is Odd. The return value of the function should be 3 if the array is Mixed.
    Input : The first integer corresponds to n and the next n integers correspond to the elements in the array.
    Output : Odd/Even/Mixed
        Case 1:
            Input
            5
            2
            4
            1
            3
            5
            Output
            Mixed
        Case 2:
            Input
            3
            5
            7
            11
            Output
            Odd
*/

public class EvenOddMixedArray {

    public static int typeOfArray(int[] arr, int num) {

        if (num > 0) {

            boolean evenFlag = true, oddFlag = true;

            for (int i = 0; i < num; i++) {

                if (arr[i] % 2 == 0)
                    oddFlag = false;
                else
                    evenFlag = false;
            }

            if (evenFlag)
                return 1;

            if (oddFlag)
                return 2;
        }

        return 3;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }

        int ans = typeOfArray(arr, num);

        switch (ans) {
            case 1 -> System.out.println("Even");
            case 2 -> System.out.println("Odd");
            default -> System.out.println("Mixed");
        }
    }
}
