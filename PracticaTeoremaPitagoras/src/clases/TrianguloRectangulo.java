package clases;
/**
 * Esta es la clase Triangulo Rectangulo
 * 
 */
public class TrianguloRectangulo {
/**
 * La variable a representa un cateto.
 * 
 * La variable b representa otro cateto
 * 
 * La variable c es la hipotenusa
 * 
 */
 double a;
 double b; 
 double c;
 
 /**
  * Este constructor crea por defecto un triángulo con los catetos en valor 1 y 1. 
  * 
  */
 public TrianguloRectangulo() {
	 this.a = 1;
	 this.b = 1;
	 this.c = hipotenusa();
 }
 
 /**
  * Este es el constructor para crear un triangulo rectangulo con los valores que se le pasan por parametro.
  * Si los catetos son menores o iguales a 0, lanza una excepcion.
  * 
  * @param a Es el cateto 1, tipo double
  * @param b Es el cateto 2, tipo double 
  */
 public TrianguloRectangulo (double a, double b) {
	 if (a <= 0 || b <= 0) {
		 throw new IllegalArgumentException ("El numero debe ser mayor a 0");
		 
	 }else {
		 this.a = a;
		 this.b = b;
		 this.c = hipotenusa();
	 }
 }
 
 /**
  * Metodo para calcular el area del triangulo 
  * 
  * @return devuelve el area tipo double 
  */
 public double area() {
	 return ((a*b)/2.0);
 }
 
 /**
  * Metodo para calcular la hipotenusa del triangulo
  * 
  * @return devuelve la hipotenusa tipo double
  */
 public double hipotenusa() {
	 double interiorRaiz = ((a*a) + (b*b));
	 double hipotenusa = Math.sqrt(interiorRaiz);
	 return hipotenusa;
 }
 
 /**
  * Método para calcular el perimetro del triangulo
  * 
  * @return devuelve el perimetro tipo double 
  */
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
