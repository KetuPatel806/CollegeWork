// 10.  Write a program that creates and initializes a four integer element array.
// Calculate and display the average of its value.

import java.util.*;

public class App1{
     
    int avg(int [] arra){
        int result = 0;
        for(int a : arra){
            result = result+a;
        }
        System.out.println("Sum of the entered number is: " + result);
        return result/4;


    }
    public static void main(String[] args) {
        int [] arr = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all 4 elements of array: ");
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
            
        }
        
        App1 obj = new App1();
         System.out.println("The average of entered number is: " + obj.avg(arr));
        // System.out.println(arr);

       
        

    }
}