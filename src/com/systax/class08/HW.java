package com.systax.class08;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*calculate sum of all even and all odd numbers from range 1-10
 * 
 */
		int eSum=0;
		int oSum=0;
		for (int i=1; i<=10; i++) {
			if (i%2==0){
				eSum+=i;
			}else {
				oSum+=i;
			}
			System.out.println("Sum of even numbers="+ eSum);
			System.out.println("Sum of odd numbers="+oSum);
		}
	}

}
