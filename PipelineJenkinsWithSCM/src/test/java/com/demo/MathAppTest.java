package com.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathAppTest {

	@Test
	public void testAdd() {
		
		Calculator cd=new Calculator();
		assertEquals(20,cd.add(10,10));
	}

}
