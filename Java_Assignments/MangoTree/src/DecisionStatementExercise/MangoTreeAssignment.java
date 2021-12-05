package DecisionStatementExercise;

import java.util.Scanner;

/* Question
Dora is interested so much in gardening and she plants more trees in her garden. She plants trees in a rectangular fashion with the order of rows and columns and numbered the trees in row-wise order. She planted the mango tree only in a 1st row, 1st column, and last column. So given the tree number, your task is to find whether the given tree is a mango tree or not? Write a program to check whether the given number is a mango tree or not.
Input consists of 3 integers
The first input denotes the number of rows
The second input denotes the number of columns
The third input denotes the tree number, which you have to find whether it's a mango tree or not.

Case 1:
    Input
    5
    5
    11
    Output
    yes
Case 2:
    Input
    5
    5
    14
    Output
    no
Case 3:
    Input
    10
    60
    2
    Output
    yes
 */

public class MangoTreeAssignment {

    public static boolean DoraMangoTree(int rows, int cols, int num) {

        if (cols > 0 && rows > 0 && num >= 1 && num <= rows * cols) {

            int rowNum = (num - 1) / cols;
            int colNum = (num - 1) % cols;

            return rowNum == 0 || colNum == 0 || (colNum == cols - 1);
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int num = scan.nextInt();

        if (DoraMangoTree(rows, cols, num))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}