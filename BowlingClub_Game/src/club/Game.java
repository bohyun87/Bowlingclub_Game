package club;

import java.util.ArrayList;

import handiScore.Define;

public class Game {
	private String gameName;
	private int gameId;
	private int handiType;
	
	private ArrayList<Member> atdMemberList = new ArrayList<Member>();
	private ArrayList<Member> MemberList = new ArrayList<Member>();
	
	public Game(String gameName, int gameId) {
		this.gameName = gameName;
		this.gameId = gameId;
		this.handiType = Define.MALE;
	}
	
	//정기전 참석 희망한 회원
	public void register(Member member) {
		atdMemberList.add(member);
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getHandiType() {
		return handiType;
	}

	public void setHandiType(int handiType) {
		this.handiType = handiType;
	}

	public ArrayList<Member> getAtdMemberList() {
		return atdMemberList;
	}

	public void setAtdMemberList(ArrayList<Member> atdMemberList) {
		this.atdMemberList = atdMemberList;
	}

	public ArrayList<Member> getMemberList() {
		return MemberList;
	}

	public void setMemberList(ArrayList<Member> memberList) {
		MemberList = memberList;
	}
	
	
	
	
	
}
