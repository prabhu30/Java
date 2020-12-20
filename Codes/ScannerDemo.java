// Java program to read data of various types using Scanner class.
import java.util.Scanner;
public class ScannerDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // String input
        String name = sc.nextLine();

        // Character input
        char gender = sc.next().charAt(0);

        // Numerical data input
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double cgpa = sc.nextDouble();
        byte subjects = sc.nextByte();
        short marks = sc.nextShort();
        float perc = sc.nextFloat();

        // Print the values to check if the input was correctly obtained.
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+mobileNo);
        System.out.println("CGPA: "+cgpa);
        System.out.println("Number of Subjects: "+subjects);
        System.out.println("Total Marks: "+marks);
        System.out.println("Percentage: "+perc);
    }
}


/*
INPUT :
Geek
F
40
9876543210
9.9
6
596
99.34



OUTPUT :
Name: Geek
Gender: F
Age: 40
Mobile Number: 9876543210
CGPA: 9.9
Number of Subjects: 6
Total Marks: 596
Percentage: 99.34
*/
