package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        * Unlike whole numbers , floating point numbers have fractional parts that is expressed with a decimal point.
        * 3.14247 is an example.
        * Floating point numbers are also known as real numbers. We use floating point number when we need more "precision"
        * in calculations.
        *
        * In java there are two datatypes to express floating point numbers "float and double".
        *
        * float is single precision number.
        * double is double precision number.
        *
        * precision here refers to the format and amount of space occupied by the type. 
        * Single precision occupies 32 bits i.e 4 bytes(so width is of 32) and Double precision 
        * occupies 64 bits(this has a width of 64)
        *  */
        
        float floatValueMax = Float.MAX_VALUE;
        float floatValueMin = Float.MIN_VALUE;
        System.out.println("floatValueMax: "+ floatValueMax);
        System.out.println("floatValueMix: "+ floatValueMin);


        double doubleValueMax = Double.MAX_VALUE;
        double doubleValueMin = Double.MIN_VALUE;
        System.out.println("doubleValueMax: "+ doubleValueMax);
        System.out.println("doubleValueMix: "+ doubleValueMin);

        // note : double is assumed to be datatype of floating point number in java.
        // so we have to expicitly say to java compiler by mentioning "f" in the end of number. for ex: 23.455f, pther wise this will give error.
        float $float = 4.46f; // if we write only 4.46 then it will throw error.
        double $double = 4.46; // this is legal, won't so any error; but we can also use "explicitly "d" in the end. for more readability //

        int $int = 4;
        float $myfloat = 4f;
        double $mydouble = 4d;
        System.out.println($int);
        System.out.println($myfloat); // see in output 4.0 appears because it is float and precision value is 0 here.
        System.out.println($mydouble); // see in output 4.0 appears because it is double and precision value is 0 here.

        // lets play with division
        int $intDiv = 5/2;
        float $myDivFloat = 5/3f; // any of denomenator or numerator  must be float for floating point division here
        double $myDivDouble = 5/3d; // any of denomenator or numerator  must be double for floating point division here
        // so we can also use 5.0/3.0
        System.out.println($intDiv);
        System.out.println($myDivFloat); // see in output 4.0 appears because it is float and precision value is 0 here.
        System.out.println($myDivDouble); // see in output 4.0 appears because it is double and precision value is 0 here.

        // note: java has a solution, if you want more precision in floating point number its, "BigDecimal"; will see later in the course.
    }
}
