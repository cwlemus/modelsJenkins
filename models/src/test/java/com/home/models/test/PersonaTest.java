package com.home.models.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.home.models.Persona;



class PersonaTest {

	@Test
	void MayorEdadTest() {
		// AAA
		// arrange preparar
		Persona p = new Persona("pepe", 20);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}

	@Test
	void MayorEdadTest2() {
		// AAA
		// arrange preparar
		Persona p = new Persona("pepe", 20);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}
	
	@Test
	void MayorEdadTest3() {
		// AAA
		// arrange preparar
		Persona p = new Persona("pepe", 20);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}
	
	@Test
	void MayorEdadTest4() {
		// AAA
		// arrange preparar
		Persona p = new Persona("pepe", 20);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}
	
	@Test
	void MayorEdadTest5() {
		// AAA
		// arrange preparar
		Persona p = new Persona("pepe", 10);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}
}
