package baekjoon.greedy.fail;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 그리디 알고리즘 / S2
 *
 * 1931번: 회의실 배정
 * https://www.acmicpc.net/problem/1931
 *
 * ING
 */
public class Main_1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        int n = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[n][2];
        for(int i = 0; i < arr.length; i++){
            String str = sc.nextLine();
            String[] srr = str.split(" ");

            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = Integer.parseInt(srr[j]);
            }
        }
        int result = 0;

        // logic
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] arr1, int[] arr2) {
                if(arr1[0] == arr2[0]){
                    return arr1[1] - arr2[1];
                }else{
                    return arr1[0] - arr2[0];
                }
            }
        });

        printArray2D(arr);

        // print
        System.out.println(result);

        sc.close();
    }

    // 2차원 배열 print 함수
    private static void printArray2D(int[][] arr) {
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
