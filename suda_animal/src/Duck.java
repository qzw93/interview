package src;

class Duck extends Animal{
	
	Duck(String species,String name){
	super(species, name);
	}
	String speak (){
		return this.getName() +" "+ "clucks";
	}

	String move(){
		return this.getName() +" " +"swims";
	}
}
