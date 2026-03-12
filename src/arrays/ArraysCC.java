package arrays;
import java.util.*;

public class ArraysCC {

    // Linear Search
    public static int linearSearch(int arr[], int key){

        for(int i =0;i<arr.length;i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    //******************************************************************************
    //Largest and Smallest mode

    public static int[] getLargestAndSmallestNumber(int[] arr){
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;

        for(int i =0; i<arr.length; i++){
            if(arr[i] > largestNumber){
                largestNumber = arr[i];
            }
            if(arr[i]<smallestNumber){
                smallestNumber = arr[i];
            }
        }

        int[] ans = {largestNumber, smallestNumber};
        return ans;
    }

    //******************************************************************************
    // Binary Search

    public static int binarySearch(int[] arr, int key){
        int start =0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start +end)/2;

            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
            else if(arr[mid]>key){
                end = mid-1;
            }
        }
        return -1;
    }

    //******************************************************************************
    // Reverse an Array

    public static void reverseArray(int[] arr){

        int start =0;
        int end = arr.length -1;

        while(start< end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

//******************************************************************************************************
        //Input in array

//        int marks[] = new int[10];
//        Scanner sc = new Scanner(System.in);
//
//        marks[0] = sc.nextInt();
//        marks[1] = sc.nextInt();
//
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);

//******************************************************************************************************
        //Linear Search

//        int numbers[] = {1,23,45,23,56,77,75,76};
//        int key = 56;
//
//        int index = linearSearch(numbers, key);
//
//        System.out.println("Key is at index: "+ index  );

//******************************************************************************************************
        //Largest Number

//        int[] num = {2,3,6,12,45,75,3,88656,87,87,6,54,65,3,5,5555543,2,3,5,12,12,56,6};
//
//        int[] res = getLargestAndSmallestNumber(num);
//
//        System.out.println("Largest Number = "+res[0]+" Smallest Number = "+res[1]);


//******************************************************************************************************
        //Binary Search

//        int[] arr = {0,12,23,45,67,72,75,84};
//        int key = 45;
//
//        int res = binarySearch(arr, key);
//        System.out.println("key is present at: "+ res);

//******************************************************************************************************
        //Reverse an Array


        int[] arr = {23,3,53,23,35,89,344,45};
        reverseArray(arr);

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
