import java.util.*;

public class DucEncrypt
{
	private String prompt;
	private char[] abc = "aabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWZYZ".toCharArray();
	private ArrayList<Integer> encrypt = new ArrayList<Integer>();
	private Scanner in = new Scanner(System.in);

	public String ePrompt()
	{
		System.out.println("\n----------");
		System.out.println("ENCRYPTION");
		System.out.println("----------");
		System.out.print("Please enter message you want to encrypt (in words): ");
		prompt = in.nextLine();

		return prompt;
	}

	public void encrypt(String word)
	{
		char[] beforeEncrypt = word.toCharArray();

		for (int i = 0; i < beforeEncrypt.length; i++) 
		{
			for(int j = 1; j < abc.length; j++)
			{
				if(beforeEncrypt[i] == abc[j])
				{
					encrypt.add(j);
				}
			}
		}
	}

	public void eDisplay()
	{
		for(int i = 0; i < encrypt.size(); i++)
		{
			System.out.print(Integer.toBinaryString(encrypt.get(i)) + " ");
		}
	}
}