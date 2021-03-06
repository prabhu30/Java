/*      When we assign an integer value to an Integer object, the value is autoboxed into an Integer object. 
        For example the statement "Integer x = 10" creates an object 'x' with value 10.
        Following are some interesting output questions based on comparison of Autoboxed Integer objects.     */


class Main1 {
    Integer x = 400, y = 400;
}

public class AutoboxedIntegers{
    public static void main(String args[]) {
        Main1 m = new Main1();
        if (m.x == m.y)
            System.out.println("Same");
        else
            System.out.println("Not Same");
        
        Integer x = 40, y = 40;
        if (x == y)
            System.out.println("Same");
        else
            System.out.println("Not Same");
    }
}

//  OUTPUT :
//  Not Same
//  Same

/*      In Java, values from -128 to 127 are cached, so the same objects are returned. 
        The implementation of valueOf() uses cached objects if the value is between -128 to 127.
        If we explicitly create Integer objects using new operator, we get the output as "Not Same"     */

/* =========================================================================================
CODE 1 :

public class Main {
    public static void main(String args[]) {
          Integer x = new Integer(40), y = new Integer(40);
         if (x == y)
            System.out.println("Same");
         else
            System.out.println("Not Same");
    }
}

OUTPUT : Not Same
========================================================================================= */



/* =========================================================================================
CODE 2 :

class GFG
{
    public static void main(String[] args)
    {
    Integer X = new Integer(10);
    Integer Y = 10;

    // Due to auto-boxing, a new Wrapper object
    // is created which is pointed by Y
    System.out.println(X == Y);
    }
}

OUTPUT : false
========================================================================================= */
