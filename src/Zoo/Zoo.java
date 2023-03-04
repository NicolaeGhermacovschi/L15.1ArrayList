package Zoo;

import java.util.ArrayList;

public class Zoo {
	
	private ArrayList<Animal> animals  = new ArrayList<>();
	
	public void presentAnimals() {
//		Animal animal = new Animal("Animal", 5, "meat", Action.EAT);
//		Animal elefant = new Elefant("Elefant", 6, "grass", Action.HB);
//		Animal leu = new Leu("Leu", 15, "meat", Action.SLEEP);
//		Animal jaguar = new Jaguar("Jaguar", 7, "meat", Action.DRINK);
//		Animal zebra = new Zebra("Zebra", 8, "grass" , Action.DRINK );
		
		animals.add(new Animal("Animal", 5, "meat", Action.EAT));
		animals.add(new Elefant("Elefant", 6, "grass", Action.HB));
		animals.add(new Leu("Leu", 15, "meat", Action.SLEEP));
		animals.add(new Lup("Lup", 7, "meat", Action.HB));
		animals.add(new Jaguar("Jaguar", 7, "meat", Action.EAT));
		animals.add(new Zebra("Zebra", 8, "grass" , Action.DRINK ));

	}

 
	
	
	public void returnAllAnimal() {

		for (Animal animal : animals) {
			System.out.println(animal + " " + animal.whatDo());
		}
	}

	public void addAnimal(Animal obj) {
		animals.add(obj);
		
	}
	
	public void addAnimalOnPosition(Animal obj, int position) {
		animals.add(position, obj);
	}
	
	
	public void removeFromList(int nr) {
		animals.remove(nr);
	}

}























