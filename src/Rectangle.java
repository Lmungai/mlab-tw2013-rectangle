
public class Rectangle {

	//class variables
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	//return the area of the rectangle
	public int area() {
		return width * height;
	}

	//return the perimeter of the rectangle
	public int perimeter() {
		return (width + height) * 2;
	}

}
