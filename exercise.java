import java.util.Scanner;
public class exercise{
	public static void main (String[] args){

		int max; //variable to store the length of the longest word

		System.out.print("Inserisci la prima stringa: ");
		String a = new Scanner(System.in).nextLine();
		max = a.length();
		System.out.print("Inserisci la seconda stringa: ");
		String b = new Scanner(System.in).nextLine();
		max = (max > b.length()) ? max : b.length();
		System.out.print("Inserisci la terza stringa: ");
		String c = new Scanner(System.in).nextLine();
		max = (max > c.length()) ? max : c.length();

		//the cycle is repeated for the extension of the longest word
		for(int i = 0; i < max; i++)
		{
				//if the words are shorter than the max, they print in blank
				System.out.print((i < a.length()) ? a.charAt(i) : ' ');
				System.out.print((i < b.length()) ? b.charAt(i) : ' ');
				System.out.print((i < c.length()) ? c.charAt(i) : ' ');
				System.out.println();	
		}			
	}
}