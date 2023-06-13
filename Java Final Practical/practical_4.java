import java.util.Scanner;

public class practical_4

{
	
	public static void main(String[] args )
	{
	 Scanner sc = new Scanner(System.in);

	 System.out.println("Enter the number which you find factorial : ");
	 int num = sc.nextInt();

	 int Fact = 1;
	 for(int i = 1; i <= num; i++ )
	 {
		Fact = Fact * i;

	 }
		System.out.print(num+ "! = " + Fact);
	 

		sc.close();
	}
}