import org.junit.Test;

import static org.junit.Assert.*;


public class FibonacciTest {
  @Test
  public void fibonacciMethodWith0() throws Exception {
    Fibonacci fibonacci = new Fibonacci();
    assertEquals(0, fibonacci.fibonacciMethod(0));
  }

  @Test
  public void fibonacciMethodInt() throws Exception {
    Fibonacci fibonacci = new Fibonacci();
    assertEquals(55, fibonacci.fibonacciMethod(10));
  }

  @Test
  public void fibonacciMethodWith1() throws Exception {
    Fibonacci fibonacci = new Fibonacci();
    assertEquals(1,  fibonacci.fibonacciMethod(1));
  }
}