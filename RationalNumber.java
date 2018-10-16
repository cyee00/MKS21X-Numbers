public class RationalNumber extends RealNumber {
  private String r;
  private double num,den;
  public RationalNumber(double n,double d) {
    super(n);
  }
  public String getRationalNumber() {
    return r;
  }
  public String toString() {
    return "RationalNumber: "+r;
  }
  public String compareRationalToRational(RationalNumber other) {
    return "";
  }
  public String compareRationalToReal(RealNumber other) {
    return "";
  }
}
