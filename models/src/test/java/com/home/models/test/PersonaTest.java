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

}
