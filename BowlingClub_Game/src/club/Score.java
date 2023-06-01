package club;

public class Score {
	private int memberId;
	private Game game;
	private int score;
	private int sum;	 //정기전 점수 합계
	private double avg;  //정기전 에버리지
	
	public Score(int memberId, Game game, int score) {
		this.memberId = memberId;
		this.game = game;
		this.score = score;
	}

	@Override
	public String toString() {
		return "회원번호: " + this.memberId + ", " + game.getGameName() + ": " + this.score ;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	
}
