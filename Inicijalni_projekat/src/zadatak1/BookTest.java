package zadatak1;

public class BookTest {

	public static void main(String[] args) {
		Book bookOne = new Book();
		Book bookTwo=new Book("Dan Brown","Digital Fortress", 445, 900.00);
		bookOne.setName("Inferno");
		bookOne.setAutor("Dan Brown");
		bookOne.setNumberOfPages(445);
		bookOne.setPrice(950.00);
		System.out.println("Discount price: " + bookOne.calculateDiscountPrice(15));
		if(bookOne.calculateDiscountPrice(15)<bookTwo.calculateDiscountPrice(20))
			System.out.println(bookOne);
			else
				System.out.println(bookTwo);
		}	
	}


