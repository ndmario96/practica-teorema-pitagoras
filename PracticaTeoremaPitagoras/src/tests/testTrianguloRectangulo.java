package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {

	static TrianguloRectangulo tr;
	static TrianguloRectangulo triangulo2;
	
	@BeforeAll
	static void setup() {
		tr = new TrianguloRectangulo();
		triangulo2 = new TrianguloRectangulo(2,3);
	}
	
	@Test
	void testAreaTrianguloPorDefecto() {
		double areaObtenida = tr.area();
		double areaEsperada = 0.5;
		assertEquals(areaEsperada,areaObtenida, 0.0001);
	}

	@Test
	void testHipotenusaTrianguloPorDefecto() {
		double hipotenusaObtenida = tr.hipotenusa();
		double hipotenusaEsperada = 1.4142;
		assertEquals(hipotenusaObtenida, hipotenusaEsperada, 0.0001);
	}

	@Test
	void testPerimetroTrianguloPorDefecto() {
		double perimetroObtenido = tr.perimetro();
		double perimetroEsperado = 3.4142;
		assertEquals(perimetroObtenido, perimetroEsperado, 0.0001);
	}
	
	@Test
	void testArea() {
		double areaObtenida = triangulo2.area();
		double areaEsperada = 3;
		assertEquals(areaObtenida, areaEsperada, 0.0001);
	}
	
	@Test
	void testHipotenusa() {
		double hipotenusaObtenida = triangulo2.hipotenusa();
		double hipotenusaEsperada = 3.6055;
		assertEquals(hipotenusaObtenida, hipotenusaEsperada, 0.0001);
	}
	
	@Test
	void testPerimetro() {
		double perimetroObtenido = triangulo2.perimetro();
		double perimetroEsperado = 8.6055;
		assertEquals (perimetroObtenido, perimetroEsperado, 0.0001);
	}
	
	@Test
	void testExcepcion() {
		Exception excepcion = assertThrows(IllegalArgumentException.class, () -> new TrianguloRectangulo(-1,0));
		String mensajeEsperado = "El numero debe ser mayor a 0";
		String mensajeObtenido = excepcion.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}

}
