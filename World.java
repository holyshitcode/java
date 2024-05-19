package game;
import java.util.Scanner;
public class World extends Character{
	String region;
	Scanner scanner = new Scanner(System.in);
	int num = 0;
	int breadNum = 0;
	int waterNum = 0;
	
	public World(String name, String stats, String jobtype){
		super(name, stats);
		this.showInfo();
		this.getJob();
		if (jobtype.equals("warrior")) {
			this.region = "ferrion";
		}
		else if (jobtype.equals("archor")) {
			this.region = "henesis";
		}
		else if (jobtype.equals("magician")) {
			this.region = "elinia";
		}
		else if (jobtype.equals("thief")) {
			this.region = "shadowcity";
		}

	}
	public void showShop() {
		System.out.println("Enter 1 = bread(1000) , 2 = water(500)");
		num = scanner.nextInt();
		switch (num) {
		case 1:
			if (this.money >= 1000 ) {
				this.money = this.money - 1000;
				this.breadNum = this.breadNum + 1;
				System.out.println("You bought a bread");
				System.out.println("You have "+this.breadNum);
				System.out.println("You have"+ this.money);
				break;
			}
			else {
				System.out.println("Failed to buy");
				break;
			}
			
		case 2:
			if (this.money >= 500) {
				this.money = this.money - 500;
				this.waterNum = this.waterNum + 1;
				System.out.println("You bought a water");
				System.out.println("You have "+ this.waterNum);
				System.out.println("You have"+ this.money);
				break;
			}
			else {
				System.out.println("Failed to buy");
				break;
			}
		}
		this.showBag();
		
	}
	public void regionShow() {
		System.out.println("Your region is "+ this.region);
		System.out.println("Enter 1 = ferrion , 2 = henesis , 3 = elinia , 4 = shadowcity, 5 = none");
		num = scanner.nextInt();
		switch (num) {
		case 1:
			this.region = "ferrion";
			System.out.println("You now moved to ferrion");
			break;
		case 2:
			this.region = "henesis";
			System.out.println("You now moved to henesis");
			break;
		case 3:
			this.region = "elinia";
			System.out.println("You now moved to elinia");
			break;
		case 4:
			this.region = "shadowcity";
			System.out.println("You now moved to shadowcity");
			break;
		case 5:
			this.region = this.region;
			System.out.println("You didn't move to anywhere");
			break;
		}
		
	}
	public void showBag() {
		System.out.println("In my bag water =" + waterNum +" bread = "+breadNum);
		System.out.println("Your money is =" + this.money);
	}
}
