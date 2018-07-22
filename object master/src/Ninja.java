//● default stealth to 10
//
//● A method steal(Human) that takes the amount of stealth the ninja has, removes it from the other human's health, and adds it to the ninja's
//
//● A method runAway() that decreases their health by 10
//




public class Ninja extends Human {

	public Ninja(String name) {
		super(name);
		this.setStealth(10);
		
	}
	
	public void steal(Human human) {
		human.setHealth(human.getHealth()-this.getStealth());
		this.setHealth(this.getHealth()+human.getHealth());
		
	}
	
	public void runAway() {
		this.setHealth(this.getHealth()-10);
	}
}
