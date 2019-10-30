package trainPerson;
package com.marcusbiel.javacourse.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class trainPerson {
	@Test
	public void shouldReturnHelloWorld() {
		Person marcus = new Person();
		assertEquals("Hello World", marcus.helloWorld());
	}
	
	@Test
	public void shouldReturnMarcus() {
		Person person = new Person();
		Person person2 = new Person();
	}

}
