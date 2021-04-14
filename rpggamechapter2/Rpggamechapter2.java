
package rpggamechapter2;

import java.util.Random;
import java.util.Scanner;

public class Rpggamechapter2 { 

	static Neo Neo = new Neo("Neo");
	static Smith Smith = new Smith("Smith");
	private static int x;

	public static void main(String[] args) {

		System.out.println("Kac turn olsun : ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();

		letsgo();
		winner();
		
	}

	public static void letsgo() {
		Random r1 = new Random();
		Random r2 = new Random();

		for (int i = 0; i < x; i++) {
			int rand1 = r1.nextInt(2) + 1;
			int rand2 = r2.nextInt(2);

			if (rand1 == Neo.getTas()) {
				if (rand2 == Smith.getTas()) {
					continue;
				}
				else if (rand2 == Smith.getKagit()) {
					int x = Smith.getPuan() + 1;
					Smith.setPuan(x);

				}
			}

			if (rand1 == Neo.getMakas()) {
				if (rand2 == Smith.getTas()) {
					int x = Smith.getPuan() + 1;
					Smith.setPuan(x);
				} 
				else if (rand2 == Smith.getKagit()) {
					int x = Neo.getPuan() + 1;
					Neo.setPuan(x);

				}
			}

		}
	}

	public static void winner() {
		
		if(Neo.getPuan() > Smith.getPuan()) {
			System.out.println(Neo.getPuan()+" -winner with points --> "+Neo.getAd());
		}
		if(Neo.getPuan() < Smith.getPuan()) {
			System.out.println(Smith.getPuan()+" winner with points --> "+Smith.getAd());
		}
		if(Neo.getPuan() == Smith.getPuan()) {
			System.out.println("Durum berabere bitti :)");
		}
		
		
	}
}
