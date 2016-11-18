package com.gitTest;

public class GitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 1;
		int [][] arr = new int[4][4];
		
		for(int i = 0 ; i < 4 ; i++)
			for(int j = 0 ; j < 4 ; j++ , k++)
				arr[i][j] = k;
		
		for(int i = 0 ; i < 4 ; i++)
			for(int j = 0 ; j < 4; j++)
				System.out.println(arr[i][j]);
		
		System.out.println();
	}

}
