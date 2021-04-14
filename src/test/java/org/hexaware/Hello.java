package org.hexaware;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Hello {
	
	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("beforeClass");	
	}
	@AfterClass
	public static void afterClass() {
		
		System.out.println("afterClass");
	}
	@Before
	public void beforeMethod() {
		
		System.out.println("beforeMethod");
	}
	@After
	public void afterMethod() {
		
		System.out.println("afterMethod");
	}
	@Test
	public void test1() {
		
		System.out.println("test1");
	}
	@Test
	public void test2() {
		
		System.out.println("test2");
	}
}
