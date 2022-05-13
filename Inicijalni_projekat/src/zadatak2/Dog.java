package zadatak2;

public class Dog extends Animal{
	private boolean hungry;
	
	public Dog () {
		
	}
	
	public Dog(String name, String breed, boolean selected) {
		super(name, breed);
		setSelected(selected);
	}
	public boolean isSelected() {
		return hungry;
	}
	
	public void setSelected(boolean hungry) {
		this.hungry = hungry;
	}
	
	public void feed() {
		if(this.isSelected()) {
			this.setSelected(false);
			System.out.println(this.getName()+" is full and happy");
		}
		else
			System.out.println(this.getName()+" buries food for rainy days");
			
	}
	public void namePet(String name) {
		this.setName(name);
	}
	public void respond() {
		System.out.println("woof woof");
	}
	public String toString() {
		return "name: " + this.getName() + ", race: " + this.getBreed() + ", hungry: " + this.isSelected();	
	}
	public static int calculateHumanYears(int dogYears) {
		return dogYears*15;
	}
	
	

}
