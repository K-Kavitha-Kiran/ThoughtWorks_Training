package ArraysAssignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MeanMedianMode {

    public static float mean(int[] arr, int num) {

        float sum = 0;
        for (int i = 0; i < num; i++) {
            sum += arr[i];
        }

        return sum / num;
    }

    public static float median(int[] arr, int num) {

        Arrays.sort(arr);

        if (num % 2 == 1)
            return (float) arr[num / 2];

        return (float) (arr[num / 2] + arr[(num - 1) / 2]) / 2;
    }

    public static float mode(int[] arr, int num) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int maxCount = 0;
        float mode = 0;

        for (int key : map.keySet()) {
            if (map.get(key) > maxCount) {
                maxCount = map.get(key);
                mode = key;
            }
        }
        //To print all the modes
        /*
        System.out.print("mode ");
        for (int key : map.keySet()) {
            if(map.get(key) == maxCount)
                System.out.print(key+" ");
        }*/
        return mode;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.printf("mean : " + "%.2f%n", mean(arr, num));
        System.out.printf("median : " + "%.2f%n", median(arr, num));
        System.out.printf("mode : " + "%.2f%n", mode(arr, num));
    }
}