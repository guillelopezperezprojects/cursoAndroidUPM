package package01;

public class Fraction {
	private int numerator, denominator;
	
	public Fraction(){
	
	}

	public Fraction(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public void addFractions(Fraction fraction1, Fraction fraction2, Fraction fractionRes)
	{
		if (equalDenominator(fraction1, fraction2))
		{
			fractionRes.numerator = fraction1.numerator + fraction2.numerator;
		}
		else
		{
			Fraction.convertEqualDenominator(fraction1, fraction2);
			fractionRes.numerator = fraction1.numerator+fraction2.numerator;
			fractionRes.denominator = fraction1.denominator+fraction2.denominator;
		}
	}
	
	public static void multFractions(Fraction fraction1, Fraction fraction2, Fraction fractionRes)
	{
		
		fractionRes.numerator = fraction1.getNumerator() * fraction2.getNumerator();
		fractionRes.numerator = fraction1.getDenominator() * fraction2.getDenominator();
	}
	
	public static void subFractions(Fraction fraction1, Fraction fraction2, Fraction fractionRes)
	{
		if(equalDenominator(fraction1, fraction2)){
			fractionRes.numerator = fraction1.numerator-fraction2.numerator;
			fractionRes.denominator = fraction1.denominator-fraction2.denominator;
		}
		else{
			Fraction.convertEqualDenominator(fraction1, fraction2);
			fractionRes.numerator = fraction1.numerator-fraction2.numerator;
			fractionRes.denominator = fraction1.denominator-fraction2.denominator;
		}
	}
	
	
	public static boolean equalDenominator(Fraction fraction1, Fraction fraction2){
		return fraction1.denominator == fraction2.denominator;
	}
	
	
	public static int mcd(int num1, int num2)
	{
		if(num2 != 0)
		{
			 return mcd(num2, num1%num2);
		}
		else
		{
			return num1;
		}
				
	}
	
	
	public static int mcm(int num1, int num2)
	{
		if(num1 == 0 || num2 == 0){
			return 0;
		}
		else{
			return (num1/mcd(num1,num2))*num2;
		}
	}
	
	
	public static void convertEqualDenominator(Fraction fraction1, Fraction fraction2)
	{
		int auxDenominatorF1 = fraction1.denominator;
		int auxDenominatorF2 = fraction2.denominator;
		int finalDenominator = mcm(auxDenominatorF1, auxDenominatorF2);
		int auxNumeratorF1 = fraction1.numerator;
		int auxNumeratorF2 = fraction2.numerator;
		int newNumeratorF1 = (finalDenominator/auxDenominatorF1) * auxNumeratorF1;
		int newNumeratorF2 = (finalDenominator/auxDenominatorF2) * auxNumeratorF2;
		
		//New operators
		fraction1.setDenominator(finalDenominator);
		fraction2.setDenominator(finalDenominator);
		fraction1.setNumerator(newNumeratorF1);
		fraction2.setNumerator(newNumeratorF2);
	}
	
	public void imprimirFraccion()
	{
		System.out.println(this.getNumerator() + "/" +  this.getDenominator());
	}
}
