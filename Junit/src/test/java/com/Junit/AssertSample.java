package com.Junit;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class AssertSample {
	@Test
	public void testAssertEqauls()
	{
		assertEquals(10,10);
	}
	@Test
	public void testAssertNotEquals()
	{
		assertNotEquals(89, 10);
	}
	@Test
	public void testAssertNull()
	{
		assertNull(null,null);
	}
	@Test
	public void testAssertNotNull()
	{
		assertNotNull("shalini","arul");
	}
	@Test
	public void testAssertTrue()
	{
		assertTrue(10>5);
	}
	@Test
	public void testAsserFasle()
	{
		assertFalse(10<5);
	}
	@Test
	public void testAssertSame()
	{
		assertSame("shalini","shalini");
	}
	@Test
	public void testAssertNotSame()
	{
		assertNotSame("Arul","shalini");
	}
	@Test
	public void testArrayEquals()
	{
		int[] a= {5,10,15};
		int[] b= {5,10,15};
		assertArrayEquals(a,b);
	}

}
