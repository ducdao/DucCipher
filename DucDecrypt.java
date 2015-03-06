import java.util.*;

public class DucDecrypt
{
	private char[] abcd = "aabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWZYZ".toCharArray();
	private String[] abc = new String[52];
	private String decrypt = "";

	public DucDecrypt()
	{
		for(int i = 0; i < abc.length; i++)
		{
			abc[i] = Character.toString(abcd[i]);
		}
	}

	public int[] dPrompt()
	{
		System.out.println("\n----------");
		System.out.println("DECRYPTION");
		System.out.println("----------");
		System.out.print("Please enter message you want to decrypt (in binary): ");
		
		Scanner in = new Scanner(System.in);
		String binaryString = in.nextLine();

		StringTokenizer s = new StringTokenizer(binaryString, " ");
		int token = s.countTokens();

		int[] binaryArr = new int[token * 2];
		int j = 0;

		in = new Scanner(binaryString);
		
		while(in.hasNext())
		{
			try
			{
				binaryArr[j] = Integer.parseInt(in.next(), 2);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Error! Please enter it in binary!");
			}

			binaryArr[++j] = 0;

			j++;
		}

		return binaryArr;
	}

	public void decrypt(int[] binaryArr)
	{
		for(int i = 0; i < binaryArr.length; i++)
		{
			for(int j = 1; j < abc.length; j++)
			{
				if(binaryArr[i] == j)
				{
					decrypt += abc[j];
					break;
				}
				else if(binaryArr[i] == 0)
				{
					decrypt += " ";
					break;
				}
			}
		}
	}

	public void dDisplay()
	{

		System.out.print(decrypt);
	}
}