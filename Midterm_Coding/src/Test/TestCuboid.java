package Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;
import pkgShape.Cuboid;
import pkgShape.Cuboid.*;
import pkgShape.Rectangle;

public class TestCuboid {
	@Test
	public void Construction() {
		Shape.Cuboid cboid = new Shape.Cuboid(1,2,3);
		assertTrue(cboid instanceof Shape.Cuboid);
		
	}
	
	@Test 
	public void SetDepth1() {
		Shape.Cuboid cboid = new Shape.Cuboid(1,2,3);
		cboid.setiDepth(9);
		assertEquals(cboid.getiDepth(),9);
	}
	
	@Test
	public void GetDepth() {
		Shape.Cuboid cboid = new Shape.Cuboid(1,2,3);
		assertEquals(cboid.getiDepth(),3);
		
	}
	
	@Test(expected=IllegalArgumentException.class)

	public void SetDepth2() {

		Shape.Cuboid cboid  = new Shape.Cuboid(1,2,3);
		cboid.setiDepth(0);

	}
	

	@Test

	public void Area() {

		Shape.Cuboid cboid= new Shape.Cuboid(1,2,3);
		
		assertEquals(cboid.area(), 2*(1*2+1*3+2*3),0.1);
		
		

	}
	
	

	

	@Test(expected = UnsupportedOperationException.class)

	public void PerimeterTest() {
		Shape.Cuboid cboid= new Shape.Cuboid (1,2,3);
		

		cboid.perimeter();
		

	}

	

	@Test

	public void SortByArea() {

		Shape.Cuboid cboidone = new Shape.Cuboid(1,2,3);
		Shape.Cuboid cboidtwo = new Shape.Cuboid(1,2,4);
		

		

		ArrayList<Shape.Cuboid> CboidList1 = new ArrayList<>();
		CboidList1.add(cboidone);
		CboidList1.add(cboidtwo);
		


		

		List<Shape.Cuboid> CboidList2 = new ArrayList<>();

		CboidList1.add(cboidone);
		CboidList1.add(cboidtwo);

		

		Collections.sort(CboidList1, new Shape.SortByArea());

		

		assertEquals(CboidList1,CboidList2);

		



	}
	@Test

	public void SortByVolume() {

		Shape.Cuboid cboidone  = new Shape.Cuboid(1,2,3);

		Shape.Cuboid cboidtwo  = new Shape.Cuboid(1,4,7);

		

		ArrayList<Shape.Cuboid> Cboidlist1 = new ArrayList<>();

		

		Cboidlist1.add(cboidone);

		Cboidlist1.add(cboidtwo);


		

		List<Shape.Cuboid>CboidList2 = new ArrayList<>();

		

		CboidList2.add(cboidone);

		CboidList2.add(cboidtwo);

		

		Collections.sort(Cboidlist1, new Shape.SortByVolume());

		

		assertEquals(Cboidlist1,CboidList2);

	}

}
	
