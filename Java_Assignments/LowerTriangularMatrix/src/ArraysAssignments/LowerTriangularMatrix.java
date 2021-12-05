package ArraysAssignments;

import java.util.Scanner;

/*Question
A lower triangular matrix is a square matrix in which all the elements above the diagonal are zero. That is, all the non-zero elements are in the lower triangle.
The first integer corresponds to the number of rows and the second number corresponds to the number of columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in row-wise order, first row first, then second row and so on.
Print "yes" if it is a lower triangular matrix. Print "no" if it is not a lower triangular matrix.
Case 1:
    Input
    2
    1 0
    2 3
    Output
    yes
 */

public class LowerTriangularMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[][] arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        boolean lowerTriangle = true;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {

                if (i < j) {
                    if (arr[i][j] != 0)
                        lowerTriangle = false;
                } else {
                    if (arr[i][j] == 0)
                        lowerTriangle = false;
                }
            }
        }

        if (lowerTriangle)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}