package zadatak2;

public class TestDog {

	public static void main(String[] args) {
		Dog first=new Dog("Bethoven","St. Bernard",false);
		Dog second=new Dog("Boby","Badger dog",true);
		first.feed();
		System.out.println(first);
		System.out.println(second);
		System.out.println(Dog.calculateHumanYears(3));

	}

}
