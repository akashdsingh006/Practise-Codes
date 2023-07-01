package com.practise.interview;

import java.util.ArrayList;

public class LshapedTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
                };
		
		int n=arr.length;
		int m=arr[0].length;
		
		int t=0;
		
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				list.add(arr[j][i]);
			}
			for(int k=i+1;k<m;k++)
			{
				list.add(arr[n-i-1][k]);
			}
			
		}
		System.out.println(list);
		
	}

}
