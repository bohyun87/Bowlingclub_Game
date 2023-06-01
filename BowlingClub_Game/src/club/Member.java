package club;

import java.util.ArrayList;

public class Member {
	private String memberName;
	private int memberId;
	private String gender;
	private int average;  //기존 에버리지
	private String attendance;
	
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	private ArrayList<Member> atdMemberList = new ArrayList<Member>();	
	private ArrayList<Game> gameList = new ArrayList<Game>();	
	
	public Member(String memberName, int memberId, String gender, int average) {
		this.memberName = memberName;
		this.memberId = memberId;
		this.gender = gender;
		this.average = average;
	}
	
	public Member(String memberName, int memberId, String gender, String attendance) {
		this.memberName = memberName;
		this.memberId = memberId;
		this.gender = gender;
		this.attendance = attendance;
	}
	
	public void addGameScore(Score score) {
		scoreList.add(score);
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public String getAttendance() {
		return attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}

	public ArrayList<Member> getAtdMemberList() {
		return atdMemberList;
	}

	public void setAtdMemberList(ArrayList<Member> atdMemberList) {
		this.atdMemberList = atdMemberList;
	}

	public ArrayList<Game> getGameList() {
		return gameList;
	}

	public void setGameList(ArrayList<Game> gameList) {
		this.gameList = gameList;
	}
	
	
	
	
	
}
