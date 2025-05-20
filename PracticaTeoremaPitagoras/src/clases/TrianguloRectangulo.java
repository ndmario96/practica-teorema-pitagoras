package clases;

public class TrianguloRectangulo {
 double a;
 double b; 
 double c;
 
 public TrianguloRectangulo() {
	 this.a = 1;
	 this.b = 1;
	 this.c = hipotenusa();
 }
 
 public TrianguloRectangulo (double a, double b) {
	 if (a <= 0 || b <= 0) {
		 throw new IllegalArgumentException ("El numero debe ser mayor a 0");
		 
	 }else {
		 this.a = a;
		 this.b = b;
		 this.c = hipotenusa();
	 }
 }
 
 public double area() {
	 return ((a*b)/2.0);
 }
 
 public double hipotenusa() {
	 double interiorRaiz = ((a*a) + (b*b));
	 double hipotenusa = Math.sqrt(interiorRaiz);
	 return hipotenusa;
 }
 
 public double perimetro () {
	 return a + b + c;
 }
 
 public double getA() {
	 return this.a;
 }
 
 public void setA(double nuevoA) {
	 this.a = nuevoA;
 }
 
 public double getB() {
	 return this.b;
 }
 
 public void setB(double nuevoB) {
	 this.b = nuevoB;
 }
 
 public double getC() {
	 return this.c;
 }
 
 @Override
 public String toString() {
	 String mensaje = "";
	 
	 mensaje+= "Cateto 1: " + this.a + "\n";
	 mensaje+= "Cateto 2: " + this.b + "\n";
	 mensaje+= "Hipotenusa: " + this.c + "\n";
	 
	 return mensaje;
 }
}
