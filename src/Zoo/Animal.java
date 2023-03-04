package Zoo;

public class Animal {
	private String name;
	private int age;
	private String food;
	private Action action;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getFood() {
		return food;
	}



	public void setFood(String food) {
		this.food = food;
	}
	
	public Action getAction() {
		return action;
	}



	public void setAction(Action action) {
		this.action = action;
	}



	public  Animal() {
		
	}


	public Animal(String name, int age, String food, Action acction) {
		this.name = name;
		this.age = age;
		this.food = food;
		this.action = acction;
	}

	public String whatDo( ) {
		if(getAction().equals(Action.EAT) ) {
			return getName() + " eat " + getFood();
		} else if (getAction().equals(Action.SLEEP)) {
			return getName() + " zzz";
		} else if (getAction().equals(Action.HB)) {
			setAge(age + 1);
			return getName() + " has happy birthday " + getAge();	
		} else if (getAction().equals(Action.DRINK)) {
			return getName() + " drink water";
		} else {
			return "i don't know ";
		}
	}



	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", food=" + food + ", acction=" + action + "]";
	}

	
	
}
