import java.util.Scanner;

public class snuTekst {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your sentence: ");
		String tekst = input.nextLine();
		System.out.println("Your sentence in reverse: ");
		baklengs(tekst, tekst.length() - 1);
		System.out.println("Enter a character from your sentence to count: ");
		char cnt = input.next().charAt(0);
		System.out.println(cnt + " appears " + count(tekst, cnt) + " time(s).");
		count(tekst, cnt);

	}

	public static void baklengs(String tekst, int siste) {
		if (siste == 0) {
			System.out.println(tekst.charAt(siste));
			return;
		}
		System.out.print(tekst.charAt(siste));
		baklengs(tekst, --siste);
	}

	public static int count(String tekst, char a) {
		
	 if (tekst.length() == 1)
		 return(tekst.charAt(0) == a ? 1 : 0);
	 return (tekst.charAt(0) == a ? 1 : 0) + count(tekst.substring(1, tekst.length()), a);
	}
}
	