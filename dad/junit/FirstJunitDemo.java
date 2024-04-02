package com.junit;

import static org.junit.Assert.fail;

import org.junit.Test;

public class FirstJunitDemo {
	
	@Test
	public void test1() {
		System.out.println("this is test method");
	}
	
	@Test
	public void test2() {
		System.out.println("method fail");
		fail("self fail");
	}

}
