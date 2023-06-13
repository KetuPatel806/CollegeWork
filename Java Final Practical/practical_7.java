import java.util.Scanner;

public class practical_7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the text line :");
		String line = sc.nextLine().toLowerCase();
		sc.close();

		int word_count = 0;
		int Character_count = 0;
		int vowel_count = 0;

		for(int i = 0; i < line.length(); i++)
		{
			char sentence = line.charAt(i);
			if(sentence == ' ')
			{
				word_count++;
			}
			
			else if(Character.isLetter(sentence))
			{
				Character_count++;

				if(sentence == 'a' || sentence == 'o' || sentence == 'i' || sentence == 'u' || sentence == 'e')
				{
					vowel_count++;
				}
			}
		}
		word_count++;

		System.out.println("word count is  " + word_count);
		System.out.println("Character count is  " + Character_count);
		System.out.println("vowel count is  " + vowel_count );
	}
}