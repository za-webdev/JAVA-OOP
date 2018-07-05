public class Project{
	private String name;
	private String description;
	private Double initialCost;

	public Project(){

	}

	public Project(String name){
		this.name=name;
	}

	public Project(String name , String description){
		this.name=name;
		this.description=description;
	}

	public String getName(){
		return name;
	}

	public void setName(String newName){
			name = newName;g
	}

	public String getDescription(){
		return description;
	}

	public void setDescription(String newDesc){
		description = newDesc;
	}

	public Double getInitialCost(){
		return initia
	}

	public void setInitialCost(Double cost){

	}

	public String elevatorPitch( ){
		return name +":"+description;
	}
}