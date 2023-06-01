package club;

import java.util.ArrayList;

public class BowlingClub {
	private static BowlingClub instance = new BowlingClub();
	
	private static String CLUB_NAME = "E-zen Bowling Club";
	private ArrayList<Member> memberList = new ArrayList<>();
	private ArrayList<Member> atdMemberList = new ArrayList<>();
	private ArrayList<Game> gameList = new ArrayList<>();
	
	private BowlingClub() {}
	
	public static BowlingClub getInstance() {
		if (instance == null) {
			instance = new BowlingClub();
		}
		return instance;
	}
	
	//회원가입
	public void addMember(Member member) {
		memberList.add(member);
	}
	
	//회원 리스트 출력
	public ArrayList<Member> getMemberList() {
		return memberList;
	}
	
	//정기전 참석신청한 회원
	public void addATDMember(Member member) {
		atdMemberList.add(member);
	}
	
	//정기전 참석 회원 리스트
	public ArrayList<Member> getATDMemberList() {
		return atdMemberList;
	}
	
	//정기전 게임
	public void addGame(Game game) {
		gameList.add(game);
	}
	
	//게임 리스트
	public ArrayList<Game> getGameList() {
		return gameList;
	}
	
}
