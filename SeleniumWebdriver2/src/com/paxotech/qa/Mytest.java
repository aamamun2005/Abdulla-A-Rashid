package com.paxotech.qa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Mytest {
	
	
  @BeforeClass
  public static void beforeClass()
	{
	System.out.println("beforeClass");
		
	}
	
   @Before
	public void setUp()
		{
    System.out.println("setUp");
		}
	
	@Test
	public void test1()
		{
		System.out.println("TestOne");
		
	}
	@Test
	public void test2()
	{
		System.out.println("TestTwo");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("After");
		
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("afterClass");
			
		}
}
