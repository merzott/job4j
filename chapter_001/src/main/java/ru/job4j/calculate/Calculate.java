package ru.job4j.calculate;

/** 
* writes "Hello world"
* @author Roman Merkin (roman.merkin@gmail.com)
* @version $Id$
* @since 0.1
*/
public class Calculate {
	/**
	* First program
	* @param args Array of string arguments
	*/
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	
	/**
	* Method echo.
	* @param name Your name.
	* @return Echo plus your name.
	*/
	public String echo(String name) {
		return "Echo, echo, echo : " + name;
	}	
}
