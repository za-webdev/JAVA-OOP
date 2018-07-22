//● a default health of 200
//
//●A method deathBlow(Human) that kills the other human, but reduces the Samurai's health by half
//
//●A method meditate() that heals the Samurai for half of their current health.
//
//●A method howMany() that returns the total current number of Samurai.


public class Samurai extends Human {
	 protected  static Integer count=0;

	public Samurai(String name) {
		super(name);
		this.setHealth(200);
		count ++;
		
		
	}
	
	public void deathBlow(Human human) {
		human.setHealth(human.getHealth()-human.getHealth());
		this.setHealth(this.getHealth()-this.getHealth()/2);
		
	}
	
	public void meditate() {
		this.setHealth(this.getHealth()+this.getHealth()/2);
	}
	
	public void howMany() {
		System.out.println("count is "+ count);
	}
	
}
