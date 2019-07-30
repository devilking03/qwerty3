import junit.framework.TestCase;

public class perimeterTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testPerimeter() {
		float p;
		//fail("Not yet implemented");
		Triangle t = new Triangle();
		t.setBase(5);
		p=t.perimeter();
		assertEquals(15f,p);
		
	}

}
