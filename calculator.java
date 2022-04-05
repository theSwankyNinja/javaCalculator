public class Calculator { //does arithmatic
  int calVal = 0;

  public int add (int valA) {
    calVal = calVal + valA ;
    return calVal;
  }

  public int subtract (int valA) {
    calVal = calVal - valA;
    return calVal;
  }

   public int multiply (int valA) {
    calVal = calVal *valA;
    return calVal;
  }

   public int divide (int valA) {
    calVal = calVal / valA;
    return calVal;
  }

  public int modulo (int valA) {
    calVal = calVal % valA;
    return calVal;
  }

  public static void main(String[] args) {
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(8));
    System.out.println(myCalculator.add(14));
    System.out.println(myCalculator.modulo(7));
    }

}//class end
