package ControlStructures;

import java.util.Scanner;

/*Question
Jeevitha just started work as a programming trainer for UIT's Placement Cell. She is paid Rs.100 an hour, with a few exceptions. She earns an extra Rs.15 an hour for any part of a day where she works more than 8 hours, and an extra Rs.25 an hour for hours beyond 40 in any one week. Also, she earns a 25% bonus for working on Saturday and a 50% bonus for working on Sunday. The bonuses for Saturday and Sunday are computed based on the hours worked those days; they are not used to calculate any bonus for working more than 40 hours in a week. You'll be given the number of hours Jeevitha worked on each day in a week (Sunday, Monday, ..., Saturday), and you need to compute her salary for the week.
Input consists of 7 integers less than or equal to 24 on separate lines. Print Jeevitha’s weekly salary as output.
Case 1:
    Input
    0
    8
    8
    8
    10
    6
    0
    Output
    4030
Case 2:
    Input
    4
    5
    0
    8
    0
    6
    0
    Output
    2500
Case 3:
    Input
    5
    3
    6
    1
    1
    2
    3
    Output
    2425
 */

public class WeeklySalaryCalculation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] weeklyHrs = new int[5];

        int sunHrs = scan.nextInt(), satHrs, totalHrs = 0, salary = 0;

        for (int i = 0; i < 5; i++) {
            weeklyHrs[i] = scan.nextInt();

            totalHrs += weeklyHrs[i];

            if (weeklyHrs[i] > 8) {
                salary += (weeklyHrs[i] - 8) * 15; // per day extra pay
            }

            salary += weeklyHrs[i] * 100; //regular pay
        }

        if (totalHrs > 40) {
            salary += (totalHrs - 40) * 25; // weekly extra pay
        }

        satHrs = scan.nextInt();

        salary += (125 * satHrs); //saturday bonus
        salary += (150 * sunHrs); //sunday bonus

        System.out.println(salary);
    }
}
