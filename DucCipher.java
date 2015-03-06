import java.util.*;

public class DucCipher
{
	//Encrypt: - Correspond letters into numbers
	//         - Turn the numbers into binary
	public static void main(String[] args)
	{
		System.out.println("CPE 102-01 - Duc Dao - Project 2\n\nWelcome to Duc's cipher program!");

		Scanner in = new Scanner(System.in);
		String ask, word, again;

		do
		{
			System.out.print("\nWould you like to (e)ncrypt or (d)ecrypt a message: ");
			ask = in.next();

			while(!ask.equals("e") && !ask.equals("E") && !ask.equals("d") && !ask.equals("D"))
			{
				System.out.println("Invalid entry!");
				System.out.print("\nWould you like to (e)ncrypt or (d)ecrypt a message: ");
			
				ask = in.next();
			}

			DucEncrypt de = new DucEncrypt();
			DucDecrypt dd = new DucDecrypt();

			if(ask.equals("e") || ask.equals("E")) //Encrypt
			{
				de.encrypt(de.ePrompt());

				System.out.println("\nEncrypting using Duc's Encryption...");

				System.out.print("Encrypted message: ");

				de.eDisplay();

				System.out.print("\nWould you like to enter another message (Y/N)? ");
				again = in.next();
			}
			else if(ask.equals("d") || ask.equals("D")) //Decrypt
			{
				dd.decrypt(dd.dPrompt());

				System.out.println("\nDecrypting binary...");

				System.out.print("Decrypted message: ");

				dd.dDisplay();

				System.out.print("\nWould you like to enter another message (Y/N)? ");
				again = in.next();
			}
			else
			{
				System.out.print("\nWould you like to enter another message (Y/N)? ");
				again = in.next();
			}
		
		}
		while(again.equals("y") || again.equals("Y"));

		System.out.println("\nThanks for running the program!");
	}
}