package junit5;

public class MathUtils {

	public int sum(int a, int b) {
		return a + b;
	}

	public Long calculateCircleArea(Integer radius) {
		return Math.round(Math.PI * radius * radius);
	}
}
