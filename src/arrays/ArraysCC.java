package arrays;
import java.util.*;

public class ArraysCC {

    public static int linearSearch(int arr[], int key){

        for(int i=0; i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

//        int marks[] = new int[10];
//        Scanner sc = new Scanner(System.in);
//
//        marks[0] = sc.nextInt();
//        marks[1] = sc.nextInt();
//
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);

        //Linear Search

        int numbers[] = {12,32,345,53,54,78,96};
        int key = 53;

        System.out.println("Key is present at: "+linearSearch(numbers, key));


    }
}
