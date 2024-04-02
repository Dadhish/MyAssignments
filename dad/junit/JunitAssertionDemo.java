package com.junit;

//W.a.junit program to handled Assert class with all method to check its pass or fail

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAssertionDemo {
	
	@Ignore
	@Test
	public void test1() {
		int q = 10;
		int w = 20;
		
		Assert.assertTrue(q < w);
		Assert.assertFalse(q > w);
		
	}
	
	@Test
	public void test2() {
		String s1 = "Tops";
		String s2 = null;
		String s3 = "Tops";
		
		Assert.assertNull(s2);
		Assert.assertNotNull(s1);
		
		Assert.assertSame(s1, s3);
		
	}

	
	@Test
	public void test3() {
//		int l1 = 55;
//		int l2 = 55;	
//		
//		Assert.assertEquals(l1, l2);
		
		int l3 = 66;
		int l4 = 23;
		Assert.assertNotEquals(l3, l4);				
		
	}
	
	@Test
	public void test4() {
		int[] z = {9, 5, 7, 6, 1};
		int[] u = {9, 5, 7, 6, 1};
		
		Assert.assertArrayEquals(z,u);
	}

	

}
