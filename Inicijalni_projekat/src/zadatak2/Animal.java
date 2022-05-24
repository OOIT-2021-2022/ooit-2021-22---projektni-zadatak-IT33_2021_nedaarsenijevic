package zadatak2;

public abstract class Animal {
	private String name;
	private String breed;
	
	//Metode pristupa
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	//Ostale metode
	
	public abstract void feed();
	public abstract void namePet(String name);
	public abstract void respond();
	
	//Konstruktori
	
	public Animal() {
		
	}
	
	public Animal(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

}
