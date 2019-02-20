package flyweight;

import java.util.HashMap;

public class CarFactory {

	private static final HashMap toyotaMap = new HashMap();

	public static Car getToyota(String color) {
		Toyota toyota = (Toyota) toyotaMap.get(color);

		if (toyota == null) {
			toyota = new Toyota(color);
			toyotaMap.put(color, toyota);
			System.out.println(color + " Toyota created!");
		}
		return toyota;
	}
}
