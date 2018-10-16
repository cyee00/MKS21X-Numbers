public class RationalNumber extends RealNumber {
  private String r;
  private double num,den;
  public RationalNumber(double n,double d) {
    super(n);
  }
  public String toString() {
    return "RationalNumber: "+r;
  }
}
