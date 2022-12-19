/* check mean value from 2-d array */ 

import java.util.Arrays;

public class CheckMean {
	
	public static int[] getMean(int[][] a) {
		
		int[] means = new int[a.length]; 
		
		for (int i=0; i<a.length; i++) {
			int sum = 0; 
			for (int j=0; j<a[i].length; j++) {
				sum += a[i][j]; 
				int mean = sum / a[i].length;
				means[i] = mean; 
			}
		}
		
		return means; 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{3, 3, 4, 2}, {4, 4}, {4, 0, 3, 3}, {2, 3}, {3, 3, 3}}; 
		
		System.out.println(Arrays.toString(getMean(a)));

	}

}
