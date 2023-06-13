// 12. String Operation using String Functions.  

import java.util.*;


public class App2 {
    public static void main(String[] args) {
        String name = " Shivam";
        String surname = " Yadav";

        // string operations 
        String uppername = name.toUpperCase();
        System.out.println(uppername);

        String lowername = name.toLowerCase();
        System.out.println(lowername);

        System.out.println("Length of the entered string is: " + name.length());

        String trimedname = name.trim();
        System.out.println("Trimed string is: " + trimedname);
        
        System.out.println("Character at given iddex is: " + name.charAt(5));

        System.out.println("The concated string is: " + name.concat(surname));

        System.out.println(name.equals(surname));

   

    }
}
