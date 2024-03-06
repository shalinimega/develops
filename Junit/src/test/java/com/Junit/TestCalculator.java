package com.Junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	Calualtor bb=new Calualtor();
	@Before
	public void print()
	{
	  System.out.println("hello");
	}
	@Test
	public void TestAdd()
	{
		System.out.println(bb.add(23, 560));
	}
	@Test
	public void testDiv()
	{
		bb.div();
	}
	@Test
	public void Testsub()
	{
		System.out.println(bb.sub());
	}
	@Test
	public void TestMuti()
	{
		bb.multi(89, 34);
	}
	@Test
	public void Testrevres()
	{
	  assertEquals(bb.rever("shalini"),"inilahs");
	}
	@After
	public void printz()
	{
		System.out.println("bye");
	}

	
}
