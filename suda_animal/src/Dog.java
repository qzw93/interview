package src;

public class Dog extends Animal {

	Dog(String species, String name) {
		super(species, name);
	}
	
	String speak(){
		return this.getName() +" "+"barks";
	}
	
	String move(){
		return this.getName() +" "+"runs on four feet";
	}

}
