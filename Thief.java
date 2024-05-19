package game_chr;

public class Thief extends Character {
	String specialty;
	String weapons;
	
	public Thief(String name, String stats) {
        super(name, stats);
        this.specialty = "thief";
        this.weapons = "dagger";
        this.getWeapons();
	}
	
	public void getWeapons() {
		System.out.println("I have "+this.weapons +" in my hand");
	}
	
	public void q() {
		System.out.println("Get my great dagger!");
	}
	public void w() {
		System.out.println("You cannot hide from me!");
	}
	public void e() {
		System.out.println("dagger stabbing!!");
	}
	public void r() {
		System.out.println("Rain of daggers!");
	}
	public void s() {
		System.out.println("Steal your money haha!");
	}
	
}
