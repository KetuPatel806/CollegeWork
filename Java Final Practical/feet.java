import java.util.Scanner;
class feet
{
public static void main(String args[])
{
 double feet;
double meters;
System.out.println("TO CONVERT FEET TO METERS:");
System.out.println(" ");
System.out.print("Enter the number in Feet:");
 Scanner r=new Scanner(System.in);
 feet=r.nextDouble();
 meters=feet*0.305;
 System.out.println(+feet + " FEETS is " +meters + "METERS" );
}
}
