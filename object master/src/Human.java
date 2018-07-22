
public class Human {
	private String name;
	private Integer strength;
	private Integer stealth;
	private Integer intelligence;
	private Integer health;
	
	public Human(String name) {
		this.name =name;
		this.strength=3;
		this.stealth=3;
		this.intelligence=3;
		this.health=100;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getStealth() {
		return stealth;
	}

	public void setStealth(Integer stealth) {
		this.stealth = stealth;
	}

	public Integer getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}
	
	public void attack(Human human) {
		human.setHealth(human.getHealth()-this.strength);
		System.out.println(this.name+" did "+this.strength+" damage to "+human.name);
	}
	
	public Integer displayHealth (){
		System.out.println(this.name+"'s"+" health is "+this.health);
		return this.health;
	}

}
