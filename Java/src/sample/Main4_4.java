package sample;

import java.util.Random;
import java.util.Scanner;;

public class Main4_4 {

	public static void main(String[] args) {
		int[] numbers = { 3, 4, 9 };
		Random rand  = new Random();
		System.out.println("1桁の数字を入力");

		boolean isHit = false;
		do {
			int input = new Scanner(System.in).nextInt();
			int r = rand.nextInt();



			for (int n : numbers) {
				if (n == input) {
					isHit = true;
					break;
				}
			}
			if (isHit) {
				System.out.println("あたり");
				break;

			} else {
				System.out.println("はずれ");
			}
		} while (!isHit);
	}

}
