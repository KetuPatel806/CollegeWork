import java.util.Scanner;
class Distance {
public static void main(String args[]){
Scanner n=new Scanner(System.in);
System.out.println("Enter the x coordinator of point 1:");
double x1=n.nextInt();
System.out.println("Enter the y coordinator of point 1:");
double y1=n.nextInt();
System.out.println("Enter the x coordinator of point 2:");
double x2=n.nextInt();
System.out.println("Enter the y coordinator of point 2:");
double y2=n.nextInt();
double d=Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
System.out.println("distence is "+ d);
}
}