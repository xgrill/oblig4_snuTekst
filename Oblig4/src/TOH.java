import java.util.Scanner;

public class TOH {
    static int count =0;

	static int steps = 0;
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount of plates: ");
		int n = input.nextInt();
		movePlates(n, 'A', 'B', 'C');

		System.out.print("Amount of steps: " + steps + ". Method was called " + count + " times.");
		input.close();
	}

	public static void movePlates(int n, char fromTower, char toTower, char auxTower) {
    
		steps++;
		count++;
		if (n == 1)
			System.out.println("Moves plate " + n + " from " + fromTower + " to " + toTower);
		else {
			movePlates(n - 1, fromTower, auxTower, toTower);
			System.out.println("Moves plate " + n + " from " + fromTower + " to " + toTower);
			movePlates(n - 1, auxTower, toTower, fromTower);
			
			
			
		}

	}

}