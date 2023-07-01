package com.practise.interview;

/*An anagram of a string is another string that contains the same characters, only the order of 
characters can be different. For example, “abcd” and “dabc” are an anagram of each other*/


import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.nextLine();
		
		System.out.println(checkAna(s1,s2));
	}
	
	static boolean checkAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		char[] chArray1=s1.toCharArray(); // Space - O(N)
		char[] chArray2=s2.toCharArray();
		
		Arrays.sort(chArray1); //N log(N)
		Arrays.sort(chArray2);
		
		for(int i=0;i<chArray1.length;i++)
		{
			if(chArray1[i]!=chArray2[i])
			{
				return false;
			}
		}
		
		return true;
	}
	
	static boolean checkAna(String s1,String s2)
	{
		Map<Character,Integer> map=new HashMap<>();
		for(char ch:s1.toCharArray())
		{
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
				
			}
			else
				map.put(ch, 1);
		}
		
		for(char ch:s2.toCharArray())
		{
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)-1);
				
			}
			else
				return false;
		}
		
		for(char ch:map.keySet())
		{
			int count=map.get(ch);
			if(count!=0)
				return false;
		}
		
		return true;
	}

}
