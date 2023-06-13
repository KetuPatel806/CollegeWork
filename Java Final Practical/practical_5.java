import java.util.Scanner;

 class practical_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the starting number :");
		int start_num = sc.nextInt();

		System.out.print("Enter the last number :");
		int last_num = sc.nextInt();

		for(int i = start_num; i <= last_num; i++)
		{
			if(isprime(i) == 1)
			{
				System.out.print(i + " ");
			}

		}
		sc.close();
	}



public static int isprime(int num)
{
	for(int i = 2; i <= Math.sqrt(num); i++)
	{
		if(num % i == 0)
		{
		 return -1;
		}
	}
	return 1;
}
}