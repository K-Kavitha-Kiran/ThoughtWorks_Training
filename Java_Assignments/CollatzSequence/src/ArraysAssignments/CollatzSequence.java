package ArraysAssignments;

import java.util.Scanner;

/*Question

The rules for generating Collatz Sequence are: If n is even: n = n / 2 If n is odd: n = 3n + 1
For example, if the starting number is 5 the sequence is: 5 -> 16 -> 8 -> 4 -> 2 -> 1
It has been proved for almost all integers, the repeated application of the above rule will result in a sequence that ends at 1.
The input containing an integer 'n' which denotes the given number. Print the numbers in the sequence as output

Case 1:
    Input
    5
    Output
    5 16 8 4 2 1 5
Case 2:
    Input
    1
    Output
    1 0
Case 3:
    Input
    4
    Output
    4 2 1 2
 */

public class CollatzSequence {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.print(num + " ");

        int count = 0;

        while (num != 1) {

            if (num % 2 == 0)
                num /= 2;
            else
                num = 3 * num + 1;

            count++;
            System.out.print(num + " ");
        }

        System.out.println(count);
    }
}