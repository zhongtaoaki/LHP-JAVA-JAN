package rockPaperScissorsGame;

public class Player {

	public String name;
	public int point;
	public Strategy strategy;

	public Player(String name, int point, Strategy strategy) {
		this.name = name;
		this.point = point;
		this.strategy = strategy;
	}

	public void win() {
		this.point++;
	}

}
