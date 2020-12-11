package com.company;

import java.util.Scanner;

public class FindMin {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert array length (Smaller than 20)");
        int choice = scanner.nextInt();
        while (choice>20) {
            System.out.println("Please insert again arrlength (Smaller than 20)");
            choice = scanner.nextInt();
        }
        int[] arr = new int[choice];
        System.out.println("Insert element value");
        for (int i = 0; i<choice;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Min is: " + new FindMin().findMin(arr));
    }
    public int findMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
