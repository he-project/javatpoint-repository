package com.javatpoint.abh.javastring;

//StringBuffer delete() method
public class TestStringBufferDelete {

	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.delete(1, 3);
		System.out.println(sb);// prints Hlo
	}
}