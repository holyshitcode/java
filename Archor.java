package game_chr;

public class Archor extends Character {
	String specialty;
	String weapons;
	
	public Archor(String name, String stats) {
        super(name, stats);
        this.specialty = "archor";
        this.weapons = "bow";
        this.getWeapons();
	}
	
	public void getWeapons() {
		System.out.println("I have "+this.weapons +" in my hand");
	}
	
	public void q() {
		System.out.println("Look at my precision!");
	}
	public void w() {
		System.out.println("I can shoot anywhere!");
	}
	public void e() {
		System.out.println("Double arrow!!");
	}
	public void r() {
		System.out.println("penetrating arrow!");
	}
	
	
}
