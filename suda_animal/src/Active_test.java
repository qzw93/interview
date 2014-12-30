package src;
import junit.framework.TestCase;

	public class Active_test extends TestCase {
		public void testDog(){
		Dog dog1 = new Dog("Dog","nick");
		assertEquals("nick barks",dog1.speak());
		assertEquals("nick runs on four feet",dog1.move());
		
		Dog dog2 = new Dog("Dog","nick1");
		assertEquals("nick1 barks",dog2.speak());
		assertEquals("nick1 runs on four feet",dog2.move());

		}

		public void testDuck(){
		Duck duck1 = new Duck("Duck","Tang");
		assertEquals("Tang clucks",duck1.speak());
		assertEquals("Tang swims",duck1.move());	

		Duck duck2 = new Duck("Duck","Tang1");
		assertEquals("Tang1 clucks",duck2.speak());
		assertEquals("Tang1 swims",duck2.move());
		}

		public void testCat(){
		Cat cat1 = new Cat("Cat","Tom");
		assertEquals("Tom mews",cat1.speak());
		assertEquals("Tom runs on four feet",cat1.move());

		Cat cat2 = new Cat("Cat","Tom1");
		assertEquals("Tom1 mews",cat2.speak());
		assertEquals("Tom1 runs on four feet",cat2.move());
		}

		public void testBird(){
		Bird bird1 = new Bird("Bird","B1");
		assertEquals("B1 clucks",bird1.speak());
		assertEquals("B1 flies",bird1.move());
		
		Bird bird2 = new Bird("Bird","B2");
		assertEquals("B2 clucks",bird2.speak());
		assertEquals("B2 flies",bird2.move());
		}
		}


