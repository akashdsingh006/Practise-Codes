package com.practise.interview;

import java.util.*;

public class CountPairsWithGivenSum {

    public static void main(String[] args) {
        int arr[] = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
    	//int arr[]= {1,5,5,7,-1};
        int sum = 11;
        System.out.println(countPairs(arr, sum));
    }

    static int countPairs(int arr[], int sum) {
    	
    	HashMap<Integer,Integer> map=new HashMap<>();
    	
    	int c=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(map.containsKey(sum-arr[i]))
    		{
    			c+= map.get(sum-arr[i]);
    		}
    		if(map.containsKey(arr[i]))
    		{
    			map.put(arr[i], map.get(arr[i])+1);
    		}
    		else
    		{
    			map.put(arr[i], 1);
    		}
    	}
    	
    	return c;
    }
}
