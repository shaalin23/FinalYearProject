import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.FirstClass;

public class TestFirstClass {
  
  FirstClass testFirstClass;

  @Before
  public void setUp() throws Exception {
    int firstNumber = 3;
    int secondNumber = 4;
    testFirstClass = new FirstClass(firstNumber, secondNumber);
  }

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testAddition() {
    assertEquals("Test 1, should be able to add 3 and 4", testFirstClass.simpleAddition(), 7);
  }
  
  @Test
  public void testMultiply() {
    assertEquals("Test 2, should be able to multiply 3 and 4", testFirstClass.simpleMultiply(), 12);
  }

}
