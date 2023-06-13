// Write a program to multiply two matrix.  - 10 Points
import java.util.*;


public class App5 {
    public static void main(String[] args) {
        int i , j , k;
        int a[][] = new int [3][3] , b[][] = new int[3][3] , c[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values in first matrix..");
        for( i = 0; i<3; i++){
            for( j =0; j<3; j++){
                System.out.print("Enter the values in the pocket: ["+i+"] ["+j+"] " );
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the values in second matrix..");
        for( i = 0; i<3; i++){
            for(j = 0; j<3; j++){
                System.out.print("Enter the values in the pocket ["+i+"] ["+j+"] " );
                b[i][j] = sc.nextInt();
            }
        }

        for(i = 0; i<3; i++){
            for(j = 0; j<3; j++){
                for(k = 0; k<3; k++){
                  c[i][j] = c[i][j] + a[i][k]* b[k][j];

                }
            }
        }
        System.out.println("The multiplied matrix is: ");
        for(i = 0; i<3; i++){
            for(j =0; j<3; j++ ){
                System.out.println( c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

