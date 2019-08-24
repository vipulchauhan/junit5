package junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MathUtilsTest {
	MathUtils mathUtils;

	@BeforeAll
	static void beforeAllInit() {
		System.out.println("Test Run start");
	}

	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}

	@Test
	void test() {
		Integer ip1 = 10, ip2 = 20, expectedOutput = 30;
		Integer actualOutput = mathUtils.sum(ip1, ip2);
		assertEquals(expectedOutput, actualOutput, "the sum answer is incorrect");
	}

	@Test
	void testCircleArea() {
		Integer radius = 10;
		Long actualArea = mathUtils.calculateCircleArea(radius);
		assertEquals(314L, actualArea, "circle area is incorect");
	}

	@Test
	void testDiv() {
		Integer ip1 = 10, ip2 = 0;
		assertThrows(ArithmeticException.class, () -> mathUtils.div(ip1, ip2), "Devide By zero exception");
	}

	@AfterEach
	void cleanUp() {
		mathUtils = null;
		System.out.println("Clean Up....");
	}

	@AfterAll
	static void afterAllEnds() {
		System.out.println("All tests completed...");
	}
}
