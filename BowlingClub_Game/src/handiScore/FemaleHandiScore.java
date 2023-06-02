package handiScore;

public class FemaleHandiScore implements HandicapScore {

	@Override
	public int getHandicapScore(int average) {
		int handiScore;
		int femaleHandiScore = 15;
		
		if(average >= 200) {
			handiScore = femaleHandiScore + 0;
		} else if(average < 200 && average >= 190) {
			handiScore = femaleHandiScore + 5;
		} else if(average < 190 && average >= 180) {
			handiScore = femaleHandiScore + 10;
		} else if(average < 180 && average >= 170) {
			handiScore = femaleHandiScore + 20;
		} else if(average < 170 && average >= 160) {
			handiScore = femaleHandiScore + 30;
		} else {
			handiScore = femaleHandiScore + 40;
		} 
		return handiScore;
	}

	

}
