package com.rvc.anonymous;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AnonymousInterface intVar = new AnonymousInterface() {
			public void add() {
				System.out.println("Inside add method !!");
			}
		};
		intVar.add();
    }
}
