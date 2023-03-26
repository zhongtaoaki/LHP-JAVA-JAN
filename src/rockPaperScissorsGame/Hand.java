package rockPaperScissorsGame;

public enum Hand {
	ROCK(0), SCISSORS(1), PAPER(2);

	int number;

	Hand(int number) {
		this.number = number;
	}

	public static Hand getHand(int number) {
		switch (number) {
			case 0:
				return ROCK;
			case 1:
				return SCISSORS;
			case 2:
				return PAPER;
			default:
				return null;
		}
	}

	public int fight(Hand h) {
		if (h.number == this.number) {
			return 0;
		} else if ((this.number + 1) % 3 == h.number) { //循环
			return 1;
		} else {
			return -1;
		}
	}
}
