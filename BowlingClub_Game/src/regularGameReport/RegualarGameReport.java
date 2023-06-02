package regularGameReport;

import java.util.*;
import club.*;
import handiScore.*;

public class RegualarGameReport {
	BowlingClub EZenBowlingClub = BowlingClub.getInstance();
	
	public static final String TITLE = "       [E-zen BowlingClub]";
	public static final String MEMBERLIST = "      회원 명단    \n";
	public static final String GAME = "       정기전(매주 수요일 저녁 8:30)    \n";
	public static final String HEADER = " 이름 | 성별 | 3개월 avg       \n";
	public static final String BODYHEADER = " 이름 | 성별 | 핸디 | game1 | game2 | game3 | game4     \n";
	public static final String ENTRY = "총 참여 회원 수: ";
	public static final String LINE = "----------------------------------------\n";
	
	
	
	public StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		
		ArrayList<Game> gameList = EZenBowlingClub.getGameList();
		
		System.out.println(RegualarGameReport.TITLE);
		
		Game game = gameList.get(0);
		
			for(int i=0; i<1; i++){
				makeHeader(game);
				makeMemberList(game);
				makeBodyHeader(game);
				makeBody(game);
				makeFooter();
			}
		
		return buffer.toString();
	}
	
	public void makeHeader(Game gameList) {
		buffer.append(RegualarGameReport.LINE);
		buffer.append(RegualarGameReport.MEMBERLIST);
		buffer.append(RegualarGameReport.HEADER);
		buffer.append(RegualarGameReport.LINE);		
	}
	
	public void makeMemberList(Game game) {
		
		  ArrayList<Member> memberList = game.getMemberList();
		  
		  for(int i=0; i<memberList.size(); i++) {
			  Member member = memberList.get(i);
			  
		  buffer.append(member.getMemberName()); buffer.append(" | ");
		  buffer.append(member.getGender()); buffer.append(" | ");
		  buffer.append(member.getAverage()); buffer.append("\n"); buffer.append(LINE);
		  }
		 
	}
	
	public void makeBodyHeader(Game game) {
		buffer.append("\n");
		buffer.append(RegualarGameReport.GAME);
		buffer.append(RegualarGameReport.BODYHEADER);
		buffer.append(LINE);		
	}
	
	public void makeBody(Game game) {
		ArrayList<Member> atdMemberList = game.getAtdMemberList();
		
		for(int i=0; i<atdMemberList.size(); i++) {
			Member member = atdMemberList.get(i);
			
			
			buffer.append(member.getMemberName());
			buffer.append(" | ");
			buffer.append(member.getGender());
			buffer.append(" | ");
			
			getHandiScore(member, member.getGender());
			getScore(member, member.getScoreList());
			buffer.append("\n");
			buffer.append(LINE);
			
			
		}
	}
	
	//참석회원 핸디 산출
	public void getHandiScore(Member member, String gender) {
		ArrayList<Score> scoreList = member.getScoreList();
		
		String gen = member.getGender();
		
		HandicapScore[] handicapScore = {new FemaleHandiScore(), new MaleHandiScore()};
		int handiScore;
			
		for(int i=0; i<1; i++) {
			Score score = scoreList.get(i);
			
			if(member.getGender().equals("남") ) {
				handiScore = handicapScore[Define.MALE].getHandicapScore(member.getAverage());
			} else {
				handiScore = handicapScore[Define.FEMALE].getHandicapScore(member.getAverage());
			}	
		
			buffer.append("+" + handiScore);
			buffer.append(" | ");
		}
		
		
	}
	
	//게임점수
	public void getScore(Member member, ArrayList<Score> arrayList) {
		ArrayList<Score> scoreList = member.getScoreList();
		for(Score s : scoreList ) {
			
			buffer.append(scoreList.get(0));
			buffer.append(" | ");
			
			
		}
	}
	
		
	public void makeFooter() {
		
		Map<String, String> map = new HashMap<>();
		map.put("최보현", "참");
		map.put("신명주", "참");
		map.put("황은영", "참");
		map.put("정상재", "참");
		map.put("곽도영", "참");
		map.put("김보성", "참");
		map.put("서현진", "참");
		
		buffer.append(ENTRY);
		buffer.append(map.size() + "명");		
		buffer.append("\n");
	}

	
	

}
