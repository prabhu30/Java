// Java program to demonstrate working of SimpleDateFormat
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Formatter3
{
  public static void main(String args[]) throws ParseException
  {
    // Formatting as per given pattern in the argument
    SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
    String str = ft.format(new Date());
    System.out.println("Formatted Date : " + str);

    // parsing a given String
    str = "02/18/1995";
    ft = new SimpleDateFormat("MM/dd/yyyy");
    Date date = ft.parse(str);

    // this will print the date as per parsed string
    System.out.println("Parsed Date : " + date);
  }
}



/*

OUTPUT :

Formatted Date : 09-08-2018
Parsed Date : Sat Feb 18 00:00:00 UTC 1995

*/
