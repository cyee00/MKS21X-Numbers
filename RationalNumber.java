public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0);//this value is ignored!
    numerator = nume;
    denominator = deno;
    if (denominator==0){
      numerator = 0;
      denominator = 1;
    }
    this.reduce();
  }

  public double getValue(){
    return 1.0*numerator/denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    if (numerator==0){
      return new RationalNumber(0,1);
    }
    return new RationalNumber(denominator,numerator);
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    if (numerator==other.getNumerator()&&
    denominator==other.getDenominator()) {
      return true;
    }
    return false;
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    if (numerator==0||denominator==0) {
      return "0";
    }
    if (denominator==1) {
      return ""+numerator;
    }
    return ""+numerator+"/"+denominator;
  }



  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    int c;
    while (a!=0&&b!=0) {
      c = a;
      a = b;
      b = c%b;
      gcd(a,b);
    }
    if (a==0){
      return b;
    }
    return a;
  }



  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int gcdd = gcd(numerator,denominator);
    numerator = numerator / gcdd;
    denominator = denominator / gcdd;
  }



  /******************Operations!!!!****************/


  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber((numerator*other.getNumerator()),(denominator*other.getDenominator()));
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return this.multiply(other.reciprocal());
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return null;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return null;
  }
}
