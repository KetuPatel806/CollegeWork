import java.util.Scanner;

// 09. Write a program to perform any 4 operations on a one-dimensional array.
// (sorting, searching, minimum, maximum, insertion, deletion, merging two arrays) 


public class App3 {
     
    // Minimum value from array 
    static int minimum(int [] array){
        int min = array[0];
        for(int i = 0; i<array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
            
        }
        return min;
    }

    // Maximum value from array 
    static int maximum(int [] array){
        int max = array[0];
        for(int i = 0; i<array.length; i++){
            if(max < array[i]){
                 max = array[i];
            }
            
        }
        return max;
    }

    // Searching in the array 
     static void searchelement(int [] array){
        int flag = 0;
        System.out.println("Enter the number you want to search: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        while(i<=array.length){
            if(num == array[i]){
                flag = 1;
                break;
            }
            else{
               i++;
            }
        }

        if(flag == 1){
            System.out.printf("Element %d found at index %d " , num ,  i);
        }
        else if(flag == 0){
            System.out.println("Enterred element does not exist into the array");
        }

     }
    
     
     public static void main(String[] args) {
        
        System.out.printf("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] array = new int[size];
        // System.out.println(array.length);

        // Taking input in array 
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter 1 for Minimum , number 2 for Maximum ,3 for Searching the element ");
        int key = sc.nextInt();
        switch (key) {
            case 1:
            System.out.println("Minimum value in the array is: " + minimum(array));
                 break;
            case 2:
            System.out.println("Maximu value in the array is: " + maximum(array));
            break;
            case 3:
            searchelement(array);
            break;
            default:
            System.out.println("Thank you!!");
                break;
        }
       
    }
}
 
