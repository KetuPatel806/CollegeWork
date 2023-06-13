import java.util.Scanner;

public class practical_6
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the namber which it reverse :");
	int num = sc.nextInt();

	int remender, reverse = 0;

	while(num != 0)
	{
		remender = num % 10;
		reverse = (reverse * 10) + remender;
		num = num / 10;
	}
	
	System.out.print("Revese number is  " + reverse);

	sc.close();
	}
}