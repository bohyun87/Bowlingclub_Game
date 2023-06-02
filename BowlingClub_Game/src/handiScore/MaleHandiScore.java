package handiScore;

public class MaleHandiScore implements HandicapScore {

	@Override
	public int getHandicapScore(int average) {
		int handiScore;
		int maleHandiScore = 0;
		
		if(average >= 200) {
			handiScore = 0;
		} else if(average < 200 && average >= 190) {
			handiScore = 5;
		} else if(average < 190 && average >= 180) {
			handiScore = 10;
		} else if(average < 180 && average >= 170) {
			handiScore = 20;
		} else if(average < 170 && average >= 160) {
			handiScore = 30;
		} else {
			handiScore = 40;
		}
		
		return handiScore;
	}

}
