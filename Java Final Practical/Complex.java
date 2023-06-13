class Complex {
 double real, img;
 Complex(double r, double i){
 this.real = r;
 this.img = i;
 }
 public static Complex add(Complex c1, Complex c2){
 Complex temp = new Complex(0, 0);
 temp.real = c1.real + c2.real;
 temp.img = c1.img + c2.img;
 return temp;
 }
 
 public static void main(String args[]) {
 Complex c1 = new Complex(5.5, 4);
 Complex c2 = new Complex(1.2, 3.5);
 Complex temp = Complex.add(c1, c2);
 System.out.printf("Sum is: "+ temp.real+" + "+ temp.img 
+"i");
 }
}