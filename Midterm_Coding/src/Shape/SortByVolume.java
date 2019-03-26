package Shape;
import java.util.Comparator;


public static class SortByVolume implements Comparator <Cuboid> {
	public int compareto(Cuboid one, Cuboid two) {
		return (int)(one.Volume() - two.Volume());
		
	}


}
