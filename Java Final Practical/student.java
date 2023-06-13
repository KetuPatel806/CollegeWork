import java.util.Scanner;
class student {
 String name="";
 int Enrollno,semester;
 float sub1,sub2,sub3,sub4,sub5,SPI;
 public void input(){
 Scanner r=new Scanner(System.in);
 System.out.println("enter your name:");
 name=r.nextLine();
 System.out.println("enter your enrollno:");
 Enrollno=r.nextInt();
 System.out.println("eneter your semester:");
 semester=r.nextInt();
 System.out.println("eneter your sub1 marks:");
 sub1=r.nextFloat();
 System.out.println("eneter your sub2 marks:");
 sub2=r.nextFloat();
 System.out.println("eneter your sub3 marks:");
 sub3=r.nextFloat();
 System.out.println("eneter your sub4 marks:");
 sub4=r.nextInt();
 System.out.println("eneter your sub5 marks:");
 sub5=r.nextInt();
 calcSPI();
 }
 public void calcSPI(){
 float total=sub1+sub2+sub3+sub4+sub5;
 SPI=total/50;
 }
 public void show(){
 System.out.println("Student Name:"+name);
 System.out.println("Enrollment no:"+Enrollno);
 System.out.println("Semester :"+semester);
 System.out.println("marks for sub1 is :"+sub1);
 System.out.println("marks for sub2 is :"+sub2);
 System.out.println("marks for sub3 is :"+sub3);
 System.out.println("marks for sub4 is :"+sub4);
 System.out.println("marks for sub5 is :"+sub5);
 System.out.println("student spi is :"+SPI);
 }
}
class res extends student
{
 String result;
public void calcresult()
{
if(SPI>=9.0){
result ="outstanding";
}
else if(SPI>=8.0){
 result="excellent";
}
else if(SPI>=7.0);{
 result=" good";
}
 }
public void Showresult(){
 show();
 System.out.println("result"+result);
}
}
class result{
 public static void main(String[] args) {
 res k=new res();
 k.input(); k.calcresult(); k.Showresult();
 }
}
