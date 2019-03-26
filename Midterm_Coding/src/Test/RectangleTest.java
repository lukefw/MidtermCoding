package Test;



import static org.junit.Assert.*;



import org.junit.*;
import pkgShape.Rectangle;


public class RectangleTest {

	

	@Test

	public void Construction() {

		Rectangle Rangle = new Rectangle (1,6);

		assertTrue(Rangle instanceof Rectangle);

	}
	
	@Test

	public void GetLength() {

		Rectangle Rangle = new Rectangle(1,6);

		assertTrue(Rangle.getiLength() == 6);

	}


	

	@Test

	public void GetWidth() {

		Rectangle Rangle = new Rectangle(1,6);

		assertTrue(Rangle.getiWidth() == 1);

	}

	





	@Test

	public void SetWidth() {

		Rectangle Rangle = new Rectangle(1,6);

		rect.setiWidth(4);

		assertTrue(Rangle.getiWidth() == 4);

	}

	


	

	@Test

	public void SetLength1() {

		Rectangle Rangle = new Rectangle(1,6);

		Rangle.setiLength(4);

		assertTrue(Rangle.getiLength() == 4);

	}

	

	@Test(expected = IllegalArgumentException.class)

	public void SetLength2() {

		Rectangle Rangle = new Rectangle(1,6);

		Rangle.setiLength(-7);

	}

	

	@Test

	public void Areatest() {

		Rectangle Rangle = new Rectangle(3,9);

		assertTrue(Rangle.area() == 27);

	}

	

	@Test

	public void PerimeterTest() {

		Rectangle Rangle = new Rectangle(3,9);

		assertTrue(Rangle.perimeter() == 24);

	}

	

	@Test

	public void CompareTo() {

		Rectangle Rangle1 = new Rectangle(4,3);

		Rectangle Rangle2 = new Rectangle(4,2);

		

		assertEquals(Rangle1.compareTo(Rangle2),4);

	}





}