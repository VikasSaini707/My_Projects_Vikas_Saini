package com.ust_global.stringclass;

public class TestA {
	public static void main(String[] args) {
		
		String s1 = "aishu";
		String s2 = "momo";
		
		String s3 = new String("aishu");
		String s4 = new String("aishu");
		String s5 = "aishu";
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
		
		String s6=s1.toUpperCase();
		System.out.println(s6);
		
		String s7=s1.toLowerCase();
		System.out.println(s7);
		
		char ch = s1.charAt(2);
		System.out.println(ch);
		
		boolean b =s1.equalsIgnoreCase("AiShU");
		System.out.println(b);
		
		System.out.println("===============================");
		
		StringBuffer sb1=new StringBuffer("Kavya");
		System.out.println(sb1);
		sb1.append("xyz");
		System.out.println(sb1);
		
		
		
	}
}
