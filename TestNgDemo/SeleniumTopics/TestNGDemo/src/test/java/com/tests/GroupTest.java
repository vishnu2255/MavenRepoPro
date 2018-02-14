package com.tests;

import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(groups= {"A"})
	public void test10001()
	{
		System.out.println("in test10001");
	}
	@Test(groups= {"B"})
	public void test20001()
	{
		System.out.println("in test 20001");
	}
	@Test(groups= {"A","B"})
	public void test50001()
	{
		System.out.println("in test 50001");
	}
	@Test
	public void testAdd()
	{
		
	}
	@Test(groups={"C"},dependsOnGroups="A")
	public void testSubtract()
	{
		System.out.println("in subtract");
	}
}
