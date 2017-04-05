public class Fibonacci {
  private int nNumber;

  public Fibonacci() {
    this.nNumber = nNumber;

  }

  public int fibonacciMethod(int nNumber) {

    if (nNumber == 0) {
      return 0;
    } if (nNumber == 1) {
      return 1;
    } else {
      nNumber = fibonacciMethod(nNumber - 2) + fibonacciMethod(nNumber - 1);
      return nNumber;
    }



  }

}



