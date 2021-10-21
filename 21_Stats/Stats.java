/**
   Team NBJ: Nada, Brian K., Jun Hong
   APCS PD6
   HW21 -- STAtisTically Speaking...
   2021-10-21
   
   xtra: harmonic mean is the reciprocal of the
   arithmetic mean of the reciprocals
   
   No TypeCasting (assigning value of one primitive type to another primitive type)
   
   Disco:
   It seems that when there is a floating-point number in an int, the int will round down.
   Not only that, but integers will automatically round/evaulate non-integer values. For example, when I wanted to take the cube root for geoMean(0), 1/3 was evaluated to 0, and it took the 0th power, which always returns 1.
   
   QCC:
   We couldn't covert from double to int - meaning we couldn't do the geoMean methods.
   Over the summer, we learned how to import Math, so we did that here (in order to square and cube root).
   We converted a double into a long, then a long into an int (by rounding).
 **/

import java.lang.Math;
public class Stats {
	public static int mean(int a, int b) {
		int output = (a + b) / 2;
		return output;
  		}
  
	public static double mean(double a, double b) {
		double output = (a + b) / 2;
		return output;
	}
	
	public static int max(int a, int b) {
		int output = 0;
		if (a >= b) {
			output = a;
		} else if (a < b) {
			output = b;
		}
		return output;
	}
	
	public static double max(double a, double b) {
		double output = 0;
		if (a >= b) {
			output = a;
		} else if (a < b) {
			output = b;
		}
		return output;
		
 	}
	
	/** 
  We used Math, because we weren't sure if there was any other way to get a square root --> we have to return an int variable, except sqrt() and pow() methods return doubles.
	This error:
	error: incompatible types: possible lossy conversion from double to int
	**/
	
 	public static int geoMean(int a, int b) {
		int product = a * b;
		long preOutput = Math.round(Math.pow(product, 1.0/2.0));
		int output = Math.toIntExact(preOutput);
		return output;
 	}
	
 	public static double geoMean(double a, double b) {
		double output = Math.sqrt((a * b));
		return output;
 	}
	
 	public static int max(int a, int b, int c) {
		int output = 0;
		if (a >= b && a >= c) {
			output = a;
		} else if (b >= a && b >= c) {
			output = b;
		} else if (c >= a && c >= b) {
			output = c;
		}
		return output;
 	}
	
 	public static double max(double a, double b, double c) {
		double output = 0;
		if (a >= b && a >= c) {
			output = a;
		} else if (b >= a && b >= c) {
			output = b;
		} else if (c >= a && c >= b) {
			output = c;
		}
		return output;
 	}
	
	/**
	Same error as above with the other geoMean() method, since we don't know how we can put a double into a int without the error.
	
	**/
 	public static int geoMean(int a, int b, int c) {
		int product = a * b * c;
		long preOutput = Math.round(Math.pow(product, (1.0/3.0)));
		int output = Math.toIntExact(preOutput);
		return output;
 	}
	
 	public static double geoMean(double a, double b, double c) {
		double product = a * b * c;
		double output = Math.pow(product, (1.0/3.0));
		return output;
 	}
}//end class
