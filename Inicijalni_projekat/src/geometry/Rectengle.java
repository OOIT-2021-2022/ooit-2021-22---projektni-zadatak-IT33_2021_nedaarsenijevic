package geometry;

public class Rectengle {
	
	private point upperLeft;
	private int width;
	private int height;
	private boolean selected;
	
	//Povrsina pravougaonika
	public int area() {
		return width * height;
	}
	
	//Obim pravougaonika
	public int circuference() {
		return 2*width + 2*height;
	}
	
	//Metode pristupa
	public point getUpperLeft() {
		return upperLeft;
	}
	public void setUpperLeft(point upperLeft) {
		this.upperLeft = upper.Left;
		
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth (int width) {
		this.width=width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	
	public boolean isSelected {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected=selected;
	}

}
