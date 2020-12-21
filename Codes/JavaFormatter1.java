// A Java program to demonstrate working of printf() in Java
class JavaFormatter1
{
  public static void main(String args[])
  {
    int x = 100;
    System.out.printf("Printing simple integer: x = %d\n", x);

    // this will print it upto 2 decimal places
    System.out.printf("Formatted with precison: PI = %.2f\n", Math.PI);

    float n = 5.2f;

    // automatically appends zero to the rightmost part of decimal
    System.out.printf("Formatted to specific width: n = %.4f\n", n);

    n = 2324435.3f;

    // here number is formatted from right margin and occupies a
    // width of 20 characters
    System.out.printf("Formatted to right margin: n = %20.4f\n", n);
  }
}



/*
OUTPUT :

Printing simple integer: x = 100
Formatted with precison: PI = 3.14
Formatted to specific width: n = 5.2000
Formatted to right margin: n =         2324435.2500

System.out.format() is equivalent to printf() and can also be used.
*/
