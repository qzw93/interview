package src;
class Animal{
	   private String species;
	   private String name;
	   private String color;
	   private String gender;
	   
	   Animal(String species,String name){
	      this.species=species;
	      this.name=name;
	   }
	   
	   String speak(){
		   return "";
	   }
	   
	   String move(){
		   return "";
	   }

	   void setColor(String color){
	      this.color=color;
	   }

	   void setGender(String gender){
	      this.gender=gender;
	   }
	   
	   String getColor(){
	      return this.color;
	   }

	   String getGender(){
	      return this.gender;
	   }
	   
	   String getName(){
	      return this.name;
	   }
	   
	   String getSpecies(){
	      return this.species;
	   }
	}
