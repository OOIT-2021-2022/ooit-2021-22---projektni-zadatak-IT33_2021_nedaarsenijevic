package zadatak1;

public class Book {
	private String name;
	private String autor;
	private int numberOfPages;
	private double price;
	private int pages;
	
	//Konstruktori
	public Book () {
		
	}
		
	
	
	public Book (String name, String autor) {
		this.name = name;
		this.autor = autor;
	}
	public Book (String name, String autor, int numberOfpages) {
		this(autor, name);
		this.numberOfPages = numberOfpages;
	}
	
	public Book (String name, String autor, int numberOfpages, double price) {
		this(name, autor, numberOfpages);
		this.price = price;
	}
	
	//Metode pristupa
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	public void setNumberOfPages(int pages) {
		if(pages<0)
			System.out.println("Unesite pozitivan broj!");
		else
		this.numberOfPages=pages;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if(pages<0)
			System.out.println("Unesite pozitivan broj!");
		else
		this.numberOfPages=pages;
	}
	
	//Metode calculate
	private double calculateDiscount(int percentageOfDiscount) {
		return this.price*percentageOfDiscount/100;
	}
	public double calculateDiscountPrice(int percentageOfDiscount) {
		return this.price-this.calculateDiscount(percentageOfDiscount);
	}
	public String toString() {
		return this.name + ", " + this.autor + " | Pages: " + this.numberOfPages + " | $" + this.price;
	}

}
	
