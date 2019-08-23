package junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		MathUtils mathUtils = new MathUtils();
		Integer ip1 = 10, ip2 = 20, expectedOutput = 30;
		Integer actualOutput = mathUtils.sum(ip1, ip2);
		assertEquals(expectedOutput, actualOutput, "the sum answer is incorrect");
	}

	@Test
	void testCircleArea() {
		MathUtils mathUtils = new MathUtils();
		Integer radius = 10;
		Long actualArea = mathUtils.calculateCircleArea(radius);
		assertEquals(314L, actualArea, "circle area is incorect");
	}

}
