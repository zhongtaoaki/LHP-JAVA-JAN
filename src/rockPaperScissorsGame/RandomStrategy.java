package rockPaperScissorsGame;

import java.util.Random;

// ランダム戦略
public class RandomStrategy implements Strategy {

	@Override
	public Hand nextHand(int round) {

		Random random = new Random();
		int result = random.nextInt(3);// 0,1,2
		return Hand.getHand(result);
	}
}
