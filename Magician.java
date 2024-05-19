package game_chr;

public class Magician extends Character {
	String specialty;
	String weapons;
	
	public Magician(String name, String stats) {
        super(name, stats);
        this.specialty = "magician";
        this.weapons = "wand";
        this.getWeapons();
	}
	
	public void getWeapons() {
		System.out.println("I have "+this.weapons +" in my hand");
	}
	
	public void q() {
		System.out.println("Get my great magic!");
	}
	public void w() {
		System.out.println("Prediction start!");
	}
	public void e() {
		System.out.println("magic claw!!");
	}
	public void r() {
		System.out.println("Genesis");
	}
	
	
}
