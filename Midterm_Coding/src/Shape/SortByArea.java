package Shape;
import java.util.Comparator;


public static class SortByArea implements Comparator<Cuboid> {
	public int compareto(Cuboid one, Cuboid two) {
		return (int)(one.area()- two.area());
	}
}

