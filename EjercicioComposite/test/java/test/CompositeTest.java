package test;

import static org.junit.Assert.*;

import org.junit.Test;

import composite1.*;

public class CompositeTest {
	// Calcular nota de compuestos (operación)
	// Calcular nota de hojas (operación)

	// Test para comprobar que se crean correctamente las hojas
	@Test
	public void testHoja() {
		Hoja examenFinalBBDD = new Hoja("Examen Final", 0.5, 8);
		assertEquals("Examen Final", examenFinalBBDD.getNombre());
		assertEquals(0.5, examenFinalBBDD.getPeso(), 0.01);
		assertEquals(8, examenFinalBBDD.getNota(), 0.01);
	}

	// Test para comprobar que se crean correctamente los compuestos
	@Test
	public void testCompuesto() {
		Compuesto bbdd = new Compuesto("Base de Datos");
		assertEquals("Base de Datos", bbdd.getNombre());
	}

	// Test para comprobar que se añaden correctamente hojas a compuestos
	@Test
	public void testAddHoja() {
		Compuesto bbdd = new Compuesto("Base de Datos");
		Hoja examenFinalBBDD = new Hoja("Examen Final", 0.5, 8);
		bbdd.addComponente(examenFinalBBDD);
		assertEquals(1, bbdd.getComponentes().size());
	}

	// Test para comprobar que se añaden correctamente compuestos a compuestos
	@Test
	public void testAddCompuesto() {
		Compuesto ssoo = new Compuesto("Sistemas Operativos");
		Compuesto labSSOO = new Compuesto("Laboratorio");
		ssoo.addComponente(labSSOO);
		assertEquals(1, ssoo.getComponentes().size());
	}

	// Test para comprobar que se eliminan correctamente hojas de compuestos
	@Test
	public void testRemoveHoja() {
		Compuesto bbdd = new Compuesto("Base de Datos");
		Hoja examenFinalBBDD = new Hoja("Examen Final", 0.5, 8);
		bbdd.addComponente(examenFinalBBDD);
		bbdd.removeComponente(examenFinalBBDD);
		assertEquals(0, bbdd.getComponentes().size());
	}

	// Test para comprobar que se eliminan correctamente compuestos de compuestos
	@Test
	public void testRemoveCompuesto() {
		Compuesto ssoo = new Compuesto("Sistemas Operativos");
		Compuesto labSSOO = new Compuesto("Laboratorio");
		ssoo.addComponente(labSSOO);
		ssoo.removeComponente(labSSOO);
		assertEquals(0, ssoo.getComponentes().size());
	}

	// Test para comprobar que se realiza sin problemas la operación de una hoja
	@Test
	public void testOperacionHoja() {
		Hoja examenFinalBBDD = new Hoja("Examen Final", 0.5, 8);
		assertEquals(4, (double) examenFinalBBDD.operacion(), 0.01);
	}

	// Test para comprobar que se realiza sin problemas la operación de un compuesto
	@Test
	public void testOperacionCompuesto() {
		Compuesto bbdd = new Compuesto("Base de Datos");
		Hoja examenFinalBBDD = new Hoja("Examen Final", 0.5, 8);
		Hoja trabajoFinalBBDD = new Hoja("Trabajo Final", 0.5, 7);
		bbdd.addComponente(examenFinalBBDD);
		bbdd.addComponente(trabajoFinalBBDD);
		assertEquals(7.5, (double) bbdd.operacion(), 0.01);
		
	}
}
