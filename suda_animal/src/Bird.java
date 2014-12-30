package src;
class Bird extends Animal{
	
	Bird(String species,String name){
	super(species, name);
	}
	
	String speak(){
		return this.getName() + " "+"clucks";
	}

	String move(){
		return this.getName()+ " " +"flies";
	}
}
