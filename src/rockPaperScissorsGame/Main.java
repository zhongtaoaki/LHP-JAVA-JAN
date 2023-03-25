package rockPaperScissorsGame;

public class Main {

	public static void main(String[] args) {

		Player satou = new Player("satou", 0, new RandomStrategy());
		Player suzuki = new Player("suzuki", 0, new SequentialStrategy());

		int round = 10;
		for (int i = 0; i < round; i++) {

			Hand satouHand = satou.strategy.nextHand(i);
			Hand suzukiHand = suzuki.strategy.nextHand(i);

			System.out.println("satou的出拳是: " + satouHand);
			System.out.println("suzuki的出拳是: " + suzukiHand);

			int result = satouHand.fight(suzukiHand);

			if (result == 1) {
				satou.win();
				System.out.println("satou win");
			} else if (result == -1) {
				suzuki.win();
				System.out.println("suzuki win");
			} else {
				System.out.println("平局");
			}
		}

		System.out.println("最终得分是：");
		System.out.println("satou: " + satou.point);
		System.out.println("suzuki: " + suzuki.point);
		if (satou.point > suzuki.point) {
			satou.win();
			System.out.println("satou win");
		} else if (satou.point < suzuki.point) {
			suzuki.win();
			System.out.println("suzuki win");
		} else {
			System.out.println("平局");
		}
	}
}
