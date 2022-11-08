package com.java.Basics;

public class HeterogenousArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] heter = new Object[7];
		heter[0] = new Integer(3);
		heter[1] = new String("obj string1");
		heter[2] = new Float(2.4454);
		heter[3] = new Double(23.454545);
		heter[4] = new Byte((byte) 23);
		heter[5] = new Character('w');
		heter[6] = new Boolean(true);

		for (Object h : heter) {
			System.out.println(h);
		}

		/*
		 *   Output :: 
		 *   
		 * 3 obj 
		 * string1 
		 * 2.4454 
		 * 23.454545 
		 * 23 
		 * w 
		 * true
		 */

	}

}
