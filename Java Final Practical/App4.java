import java.util.Scanner;

// 08. Write a program to check the palindrome of the given string. (use in-built Function as well loop)

public class App4 {
    static void check(String s1) {
        int flag = 0;
        int len = s1.length();
        // System.out.println(len);
        for (int i = 0; i < len; i++) {

            if (s1.charAt(i) != s1.charAt(len - i - 1)) {
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("The entered string is palindrome");
        } else {
            System.out.println("The entered string is not palindrome");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the first String: ");
        String s1 = sc.nextLine();

        check(s1);

    }
}
