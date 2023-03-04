package App;

import Zoo.*;

public class Application {
	public static void main(String[] args) {

		Animal elefant2 = new Elefant("Elefant", 8, "grass", Action.DRINK);
		Animal animal = new Animal("Urs", 9, "all", Action.SLEEP);
		
		Zoo zoo = new Zoo();
		zoo.presentAnimals();
		zoo.returnAllAnimal();
		System.out.println();
		
		zoo.addAnimal(elefant2);
		zoo.addAnimalOnPosition(animal, 0);
		zoo.returnAllAnimal();
		System.out.println();
		
		zoo.removeFromList(3);
		zoo.returnAllAnimal();
		
		
	}
}

















