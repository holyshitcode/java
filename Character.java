package game_chr;

public class Character {
	
	String name;
	String stats;
	String weapons;
	int money;
	
	public Character(String name, String stats) {
		this.name = name;
		this.stats = stats;
		this.money = 4000;
		this.showInfo();
		this.getJob();
			
	}

	public void showInfo() {
		System.out.println("Your name:"+this.name);
		System.out.println("Your stats:"+this.stats);
		System.out.println("Your money:"+this.money);
	}
	public void getJob() {
		if (this.stats.equals("Dex")) {
			System.out.println("Your class is Archor");
		}
		else if (this.stats.equals("Int")) {
			System.out.println("Your class is Magician");
		}
		else if (this.stats.equals("Str")) {
			System.out.println("Your class is Warrior");
		}
		else if (this.stats.equals("Luk")) {
			System.out.println("Your class is Thief");
		}
	}
	public void getMoney() {
		System.out.println("You got free money for 1000");
		this.money = this.money + 1000;
	}
	public void getWeapons() {
		System.out.println("Nothing in my hand");
	}
	public void useSkill(String word) {
		if (word.equals("q")) {
			this.q();
		}
		if (word.equals("w")) {
			this.w();
		}
		if (word.equals("e")) {
			this.e();
		}
		if (word.equals("r")) {
			this.r();
		}
		
	}
	public void q() {
		System.out.println("This is skill 'q'");
	}
	public void w() {
		System.out.println("This is skill 'w'");
	}
	public void e() {
		System.out.println("This is skill 'e'");
	}
	public void r() {
		System.out.println("This is skill 'r'");
	}
	public void s() {
		System.out.println("Hidden skill for someone");
	}
}


