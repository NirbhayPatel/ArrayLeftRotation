package com.nirbhay;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter the Integer:- ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

        }

        System.out.println("Enter the Number Of Rotation ");
        int d = in.nextInt();

        int result[] = rotLeft(arr, d);
        System.out.println("After Rotation :-");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }


    static int[] rotLeft(int[] a, int d) {
        int[] result = new int[a.length];
        int newRotaIndex = d % a.length;
        for (int i = 0; i < a.length; i++) {
            result[i] = a[(newRotaIndex + i) % a.length];

        }
        return result;


    }

}
