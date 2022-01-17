package com.MavenTest.test1;

/**
 * Hello world!
 *
 */
public class App 
{
	public static int wordCount(String str) {
		if(isEmpty(str))return 0;
		else return str.split("\\w+").length;
		
	}
	public static  boolean isEmpty(String str) {
		if(str.isEmpty())return true;
		return false;
	}
    public static void main( String[] args )
    {
    	
    }
}
