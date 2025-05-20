package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		
		TrianguloRectangulo t1 = new TrianguloRectangulo(2,3);
		
		TrianguloRectangulo t2 = new TrianguloRectangulo();
		
		double areat1 = t1.area();
		double perimetrot1 = t1.perimetro();
		
		double areat2 = t2.area();
		double perimetrot2 = t2.perimetro();
		
	}

}
