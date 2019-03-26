package Shape;

public class Rectangle extends Shape {
	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int Width, int Length ) throws IllegalArgumentException {
		super();
		this.setiWidth(Width);
		this.setiLength(Length);
	}
	
	public void setiWidth(int iWidth) throws IllegalArgumentException {
		if(iWidth<=0) {
			throw new IllegalArgumentException("Width needs to be positive");
		}
		this.iWidth = iWidth;
	}
		
	public int getiWidth() {
		return iWidth;
		
	}
	
	public void setiLength(int iLength) throws IllegalArgumentException {
		if(iLength <= 0)
			throw new IllegalArgumentException("Length needs to be positive");
		this.iLength = iLength;
		
	}
	
	public int getiLength() {
		return iLength;
		
	}
	public int compareTo(Object sort) {
		return (int)(this.area() - ((Rectangle) sort).area());
		
	}

	@Override
	public double area() {

		return (double)(this.iWidth*this.iLength);
	}
	@Override
	public double perimeter() {
		return (double)(2*this.iWidth + 2*this.iLength);

	}
	
	
}	
	

