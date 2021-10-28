package com.synatax.class3;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //	 * Declare variable and increase by 100 using shorthand operator
		int number=100;
		number+=100;
		System.out.println(number);
		
		 //	 * Declare variable and increase by 100 using shorthand operator
		int number2=100;
		number2-=67;
		System.out.println(number2);
		
		/* Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator
		 * each person should get an equal piece of cake
		 */
	int cakePiece=11;

	System.out.println(cakePiece/4);
	System.out.println(cakePiece%4);
	
	/* Declare variable cakePiece=25 and divide cakePiece between 7 people using shorthand operator
	 * find out how many pieces of cake left after it was distributed equally among 7 people
	 */
	
	
	 cakePiece=25;//update cakePiece if not then use cakePiece1
	 cakePiece/=7;
	 
	System.out.println(cakePiece);//25/7=3piece
	 cakePiece=25;
	System.out.println(cakePiece%7);//25/7=21 4remains
	
	
	}
	

}
