package src;

class Cat extends Animal{
	

	Cat(String species,String name){
	super(species, name);
	}
	
	String speak(){
		return this.getName() +" "+"mews";
	}

	String move(){
		return this.getName() +" "+"runs on four feet";
	}
}
