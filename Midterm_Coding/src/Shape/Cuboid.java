package Shape;

public class Cuboid extends Rectangle {
	
	private int iDepth;
	

	public Cuboid(int length, int width, int depth){
		
		super(width,length);
		this.setiDepth(depth);

	}

	public int getiDepth() {
		return iDepth;
		
	}
	
	public void setiDepth(int iDepth) throws IllegalArgumentException {
		if(iDepth<=0)
			throw new IllegalArgumentException("depth must be positive");
		this.iDepth = iDepth;
		
		
		
	}
	
	public double Volume() {
		return this.iDepth*super.area();
		
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Perimeter is unsupported");
		
	}
	
	@Override 
	public double area() {
		return (double)(2*(this.iDepth*this.getiLength())+ 2*super.area() + 2*(this.getiWidth()*this.iDepth));
		
	}
	
	@Override 
	public int compareTo(Object sort) {
		throw new UnsupportedOperationException("This operation is not supported");
		
		
	}
	
}
