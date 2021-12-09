package org.Company;

public class Company {

	public static void main(String[] args) {
		String s = ("Every day morning i am going playing     cricket  ");
		//          0123456789)
		
		System.out.println(s);
		
		int length = s.length();
		
		System.out.println(length);
		
	   boolean startsWith = s.startsWith("Every");
	   
	   System.out.println(startsWith);
		
		
	   boolean endsWith = s.endsWith("cricket");
		System.out.println(endsWith);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		int indexOf = s.indexOf("i");
		System.out.println(indexOf );
		
		int indexOf2 = s.indexOf("y");
		System.out.println(indexOf2);
		
		int indexOf3 = s.indexOf("x");
		System.out.println(indexOf3);
		
		int indexOf4 = s.indexOf("10");
		System.out.println(indexOf4);
		
		int lastIndexOf = s.lastIndexOf("i");
		System.out.println(lastIndexOf);
		
		char charAt = s.charAt(1);
		System.out.println(charAt);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		boolean contains = s.contains("i");
	    System.out.println(contains);
		
	   String replaceFirst = s.replaceFirst("c", "*");
	
       System.out.println(replaceFirst);

       String trim = s.trim();
       System.out.println(trim);
		
		
		
	}
	
}
