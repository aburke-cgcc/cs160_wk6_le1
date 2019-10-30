package edu.cgcc.cs160;

public class Puzzles {
	
	/**
	 * Monkey trouble example 1
	 * @param aSmile
	 * @param bSmile
	 */
	public static void monkeyTroubleOne(boolean aSmile, boolean bSmile) {
		if (aSmile && bSmile) {
		  System.out.println("We're in trouble.");
		}
		else if (!aSmile && !bSmile) {
		  System.out.println("We're in trouble.");
		}
		else {
			System.out.println("We're not in trouble.");
		}
	}
	
	/**
	 * Monkey trouble example 2
	 * @param aSmile
	 * @param bSmile
	 */
	public static void monkeyTroubleTwo(boolean aSmile, boolean bSmile) {
		
		if((aSmile && bSmile) || (!aSmile && !bSmile)){
			System.out.println("We're in trouble.");
		}
		else {
			System.out.println("We're not in trouble.");
		}
		
	}
	
	/**
	 * Monkey trouble example 3
	 * @param aSmile
	 * @param bSmile
	 */
	public static void monkeyTroubleThree(boolean aSmile, boolean bSmile) {
		
		if(aSmile == bSmile){
			System.out.println("We're in trouble.");
		}
		else {
			System.out.println("We're not in trouble.");
		}
		
	}
	
	/**
	 * Sleep in example 1, bad code
	 * @param weekday
	 * @param vacation
	 */
	public static void sleepInOne(boolean weekday, boolean vacation) {
		if(vacation == true) {
			System.out.println("You can sleep in.");
		}
		else if(weekday != true) {
			System.out.println("You can sleep in.");
		}
		else {
			System.out.println("You can't sleep in.");
		}
	}
	
	/**
	 * Sleep in example 2, better code
	 * @param weekday
	 * @param vacation
	 */
	public static void sleepInTwo(boolean weekday, boolean vacation) {
		if(!weekday || vacation) {
			System.out.println("You can sleep in.");
		}
		else {
			System.out.println("You can't sleep in.");
		}
	}
	
	
	
}
