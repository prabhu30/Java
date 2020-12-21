// Java program to demonstrate working of DecimalFormat
import java.text.DecimalFormat;

class JavaFormatter2
{
  public static void main(String args[])
  {
    double num = 123.4567;

    // prints only numeric part of a floating number
    DecimalFormat ft = new DecimalFormat("####");
    System.out.println("Without fraction part: num = " + ft.format(num));

    // this will print it upto 2 decimal places
    ft = new DecimalFormat("#.##");
    System.out.println("Formatted to Give precison: num = " + ft.format(num));

    // automatically appends zero to the rightmost part of decimal
    // instead of #,we use digit 0
    ft = new DecimalFormat("#.000000");
    System.out.println("appended zeroes to right: num = " + ft.format(num));

    // automatically appends zero to the leftmost of decimal number
    // instead of #,we use digit 0
    ft = new DecimalFormat("00000.00");
    System.out.println("formatting Numeric part : num = "+ft.format(num));

    // formatting money in dollars
    double income = 23456.789;
    ft = new DecimalFormat("$###,###.##");
    System.out.println("your Formatted Dream Income : " + ft.format(income));
  }
}



/*

OUTPUT :

Without fraction part: num = 123
Formatted to Give precison: num = 123.46
appended zeroes to right: num = 123.456700
formatting Numeric part : num = 00123.46
your Formatted Dream Income : $23,456.79

*/
