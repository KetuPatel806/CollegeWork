import java.util.Scanner;
class shape{
 float findvolume(float r,float h)
{
 return (float)3.14*r*r*h;
}
float findvolume(float l,float t,float w)
{
 return l*t*w;
}
float findvolume(float a)
{
 return a*a*a;
}
}
class volume
{
 public static void main(String args[])
{
 shape s=new shape();
 Scanner ref=new Scanner(System.in);
 System.out.println("to find volume of circle:");
System.out.println(" ");
 System.out.println("Enter the radius:");
 float r=ref.nextFloat();
 System.out.println("enter the height");
 float h=ref.nextFloat();
 System.out.println("volume of circle 
is:"+s.findvolume(r,h));
 System.out.println(" ");
 System.out.println("to find volume of rectangular:");
System.out.println(" ");
 System.out.println("enter the length:");
 float l=ref.nextFloat();
 System.out.println("enter the height");
 float t=ref.nextFloat();
System.out.println("enter the width:");
float w=ref.nextFloat();
System.out.println("volume of rectangular 
is:"+s.findvolume(l,t,w));
System.out.println(" ");
System.out.println("to find the volume of cube");
System.out.println(" ");
System.out.println("enter the length:");
float a=ref.nextFloat();
System.out.println("volume of cube is:"+s.findvolume(a));
}
}