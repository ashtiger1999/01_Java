package edu.kh.oop.practice.model.vo;

public class Hero {
	
	private String nickname;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private double exp;
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public Hero(String nickname, String job, int hp, int mp, int level, double exp) {
		super();
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
		
		System.out.println("\n=================캐릭터 생성=================\n");
		System.out.println(job + "직업으로 '" + nickname + "'님이 생성되었습니다."
				+ "\n현재 레벨 : " + level + "\n현재 hp : " + hp + "\n현재 mp : " + mp + "\n현재 경험치 : " + exp);
	}
	
	public void attack(double exp) {
		
		// 전달받은 경험치를 현재 경험치에 누적
		this.exp+=exp;
		// 공격 메세지 출력
		System.out.println("\n'" + this.nickname + "'은/는 공격을 했다!!! \n획득 경험치 : + " + exp);
		System.out.println("현재 경험치 : " + this.exp);
		// 단, 현재 경험치가 300 이상이면
		if(this.exp>=300) {
			// 현재 레벨을 1 증가 시키고
			this.level++;			
			this.exp-=300;
		// 레벨이 올랐다는 메세지 출력
			System.out.println("\n레벨이 올랐습니다!! \n현재 레벨 : " + this.level);
			System.out.println("현재 경험치 : " + this.exp);
		}
	}
	
	public void dash() {
		
		// 단, 현재 mp가 10이하라면
		if(this.mp<10) {
			// 마력이 부족하여 대시할 수 없다는 메세지 출력
			System.out.println("\n[마력 부족]더 이상 대시할 수 없어요~!");
		}
		else {
			// 대시할 때마다 현재 mp에서 -10씩 감소되며
			this.mp-=10;
			// 대시했다는 메세지 출력
			System.out.println("\n'" + this.nickname + "'의 엄청 빠른 대시!!! \n남은 마력 : " + this.mp);			
		}
		
	}

	@Override
	public String toString() {
		return "\n================'" + this.nickname + "'님의 정보================\n\n- 현재 레벨 : " + this.level + 
				"\n- 현재 hp : " + this.hp + 
				"\n- 현재 mp : " + this.mp + 
				"\n- 현재 exp : " + this.exp;
	}
	
	

}