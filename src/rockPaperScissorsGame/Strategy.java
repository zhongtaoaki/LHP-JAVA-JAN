package rockPaperScissorsGame;


// 设计模式 策略者模式
public interface Strategy {
	Hand nextHand(int round);
}
