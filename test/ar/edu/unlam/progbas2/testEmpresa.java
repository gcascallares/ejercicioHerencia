package ar.edu.unlam.progbas2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testEmpresa {

	@Test
	public void testCrearEmpleado() {
		Empleado miEmpleado = new Empleado("juan", 10000, 0504, "construccion");
		assertEquals("juan",miEmpleado.getNombre());
		assertEquals(10000,miEmpleado.getSalario(),0);
	}
	@Test
	public void testCrearGerente() {
		Gerente miGerente = new Gerente ("alberto",15000, 1008, "administracion",22);
		assertEquals(22,miGerente.getNumeroDeCochera(),0);
		assertEquals("administracion",miGerente.getSector());
	}
	
	@Test
	public void testCrearDirectorGeneral() {
		DirectorGeneral miDirectorGeneral = new DirectorGeneral("jose",20000,0610,"gerencia",25,800);
		assertEquals(25,miDirectorGeneral.getNumeroDeCochera(),0);
		assertEquals(800,miDirectorGeneral.getPlusSalario(),0);
	}
}
