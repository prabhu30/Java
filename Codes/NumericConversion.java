// A Java program to demonstrate that we should be careful
// when replacing conditional operator with if else or vice versa

import java.io.*;
class NumericConversion
{
    public static void main (String[] args)
    {
        // Expression 1 (using ?: )
        // Automatic promotion in conditional expression
        Object o1 = true ? new Integer(4) : new Float(2.0);
        System.out.println(o1);

        // Expression 2 (Using if-else)
        // No promotion in if else statement
        Object o2;
        if (true)
            o2 = new Integer(4);
        else
            o2 = new Float(2.0);
        System.out.println(o2);
    }
}

/*    The conditional operator will implement numeric type promotion if there are two different types as 2nd and 3rd operand in conditional expression.  
      Therefore, If either operand is of type double, the other is converted to double and hence 4 becomes 4.0.
      Whereas, the if/else construct does not perform numeric promotion and hence behaves as expected.      */

// Refer
// https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.6.2
