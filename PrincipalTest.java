package pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrincipalTest {

	@Test	
	public void nombre() {
		System.out.println("Su nombre es");
		Estudiante e= new Estudiante("Juan", "Cod1", 1.0, 2.0);
		assertTrue(e.getNombre() == "Juan");
		assertTrue(e.getCodigo() == "Cod1");
		assertTrue(e.getNota() == 1.0);
		assertTrue(e.getNota2() == 2.0);
	}
}
