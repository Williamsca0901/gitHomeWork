package GroupHW;

public class GroupHW2 {

	public static void main(String[] args) {
		// Create a 2D array or integer type where you will store odd and even numbers. 
		int [][] nums={
				{2,2,2,2},
			{3,3,3,3}
		};

			int sum=0;
			for (int i=0;i<2; i++) {
				for (int d=0; d<4; d++) {
				sum += nums[i][d];
				}
				System.out.println( sum);
			}		
		}
		

	}


