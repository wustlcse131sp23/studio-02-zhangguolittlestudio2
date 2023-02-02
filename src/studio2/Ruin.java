package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter Starting Amount");
		int startAmount = in.nextInt();
		System.out.println("Enter Winning Probability");
		double winChance = in.nextDouble();
		System.out.println("Enter Win Limit");
		int winLimit = in.nextInt();
		System.out.println("Enter total simulations");
		int totalSimulations = in.nextInt();
		int ruin = 0;
		int success = 0;

		for (int x = 0; x < totalSimulations; x++) {
			int attempts = 0;
			System.out.println("here");
			while ((startAmount >= 0 ) && (startAmount <= winLimit)) {
				System.out.println("here1");

				boolean win = Math.random() <= winChance;
				if (win) {
					startAmount = startAmount + 1;
					attempts = attempts + 1;
				} else {
					startAmount = startAmount - 1;
					attempts = attempts + 1;

				}

			}
			System.out.println("here2");

			System.out.print("day " + x + ";");
			if (startAmount == 0) {
				System.out.println("ruin");
				ruin++;
			
			} else {
				System.out.println("success");
				success++;
			}
			System.out.println(attempts);

		}

	}
}
