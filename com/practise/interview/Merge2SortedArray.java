package com.practise.interview;


public class Merge2SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,4,7,8,11,15};
		int b[]= {3,5,6,9,10,11,14};
		
		int aLen= a.length;
		int bLen= b.length;
		
		int ans[]=new int[aLen+bLen];
		
		int i=0,j=0,k=0;
		
		while(i<aLen && j< bLen)
		{
			if(a[i]<b[j])
			{
				ans[k]=a[i];
				i++;
				k++;
			}
			else
			{
				ans[k]=b[j];
				j++;
				k++;
			}
		}
		
		while(i<aLen)
		{
			ans[k]=a[i];
			i++;
			k++;
		}
		
		while(j<bLen)
		{
			ans[k]=b[j];
			j++;
			k++;
		}
		
		for(int it:ans)
		{
			System.out.print(it+" ");
		}
	}

}
