package clubInfo;

import club.*;
import handiScore.Define;
import regularGameReport.RegualarGameReport;

public class EzenBowlingClubRegularGameInfo {
	
	BowlingClub EZenBowlingClub = BowlingClub.getInstance();
	Game game1;
	Game game2;
	Game game3;
	Game game4;
	
	RegualarGameReport gameReport = new RegualarGameReport();
	

	public static void main(String[] args) {

	}
	
	//게임생성
	public void createGame() {
		game1 = new Game("game1", Define.GAME1);
		game2 = new Game("game2", Define.GAME2);
		game3 = new Game("game3", Define.GAME3);
		game4 = new Game("game4", Define.GAME4);
		
		//클럽에 게임 넣기
		EZenBowlingClub.addGame(game1);
		EZenBowlingClub.addGame(game2);
		EZenBowlingClub.addGame(game3);
		EZenBowlingClub.addGame(game4);
	}

	
	//가입한 회원 생성
	public void createMember() {
		Member member1 = new Member("최보현", 101, "여", 180);
		Member member2 = new Member("신명주", 102, "여", 160);
		Member member3 = new Member("황은영", 103, "여", 175);
		Member member4 = new Member("강요한", 104, "남", 210);
		Member member5 = new Member("정상재", 105, "남", 185);
		Member member6 = new Member("곽도영", 106, "남", 165);
		Member member7 = new Member("홍현정", 107, "여", 200);
		Member member8 = new Member("박요셉", 108, "남", 190);
		Member member9 = new Member("김보성", 109, "남", 185);
		Member member10 = new Member("서현진", 110, "남", 150);
		
		EZenBowlingClub.addMember(member1);
		EZenBowlingClub.addMember(member2);
		EZenBowlingClub.addMember(member3);
		EZenBowlingClub.addMember(member4);
		EZenBowlingClub.addMember(member5);
		EZenBowlingClub.addMember(member6);
		EZenBowlingClub.addMember(member7);
		EZenBowlingClub.addMember(member8);
		EZenBowlingClub.addMember(member9);
		EZenBowlingClub.addMember(member10);	
	}
		
	//정기전참석 회원생성
	public void createATDMember() {
		Member member1 = new Member("최보현", 101, "참");
		Member member2 = new Member("신명주", 102, "참");
		Member member3 = new Member("황은영", 103, "참");
		Member member5 = new Member("정상재", 105, "참");
		Member member6 = new Member("곽도영", 106, "참");
		Member member9 = new Member("김보성", 109, "참");
		Member member10 = new Member("서현진", 110, "참");
		
		//정기전에 등록
		EZenBowlingClub.addATDMember(member1);
		EZenBowlingClub.addATDMember(member2);
		EZenBowlingClub.addATDMember(member3);
		EZenBowlingClub.addATDMember(member5);
		EZenBowlingClub.addATDMember(member6);
		EZenBowlingClub.addATDMember(member9);
		EZenBowlingClub.addATDMember(member10);
		
		//게임에 회원 등록
		game1.register(member1);
		game1.register(member2);
		game1.register(member3);
		game1.register(member5);
		game1.register(member6);
		game1.register(member9);
		game1.register(member10);
		
		game2.register(member1);
		game2.register(member2);
		game2.register(member3);
		game2.register(member5);
		game2.register(member6);
		game2.register(member9);
		game2.register(member10);
		
		game3.register(member1);
		game3.register(member2);
		game3.register(member3);
		game3.register(member5);
		game3.register(member6);
		game3.register(member9);
		game3.register(member10);
	
		game4.register(member1);
		game4.register(member2);
		game4.register(member3);
		game4.register(member5);
		game4.register(member6);
		game4.register(member9);
		game4.register(member10);
		
		//회원의 점수 추가
		addScoreForMember(member1, game1, 178);
		
		
	}
}
