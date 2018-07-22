//● default health to 50
//
//● default intelligence to 8
//
//● A method heal(Human) that heals the other human by the wizard's intelligence
//
//● A method fireball(Human) that decreases the other human's health by the wizard's intelligence * 3


public class Wizard extends Human {

	public Wizard(String name) {
		super(name);
		
		this.setHealth(50);
		this.setIntelligence(8);
		
	}
	
	public void heal(Human human) {
		human.setHealth(human.getHealth()+this.getIntelligence());
	}
	
	public void fireball(Human human) {
		human.setHealth(human.getHealth()-this.getIntelligence()*3);
	}
	
	
}
