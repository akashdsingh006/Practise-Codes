package com.practise.interview;

import java.util.*;
public class Permuations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String per="";
		ArrayList<String> list=new ArrayList<>();
		getPtr(s,per,list);
		
		System.out.println(list);
	}
	
	static void getPtr(String s,String per,ArrayList<String> list)
	{
		if(s.length()==0)
		{
			list.add(per);
			return;
		}
		for(int i=0;i<s.length();i++)
		{
			char curr=s.charAt(i);
			String newStr= s.substring(0,i)+s.substring(i+1);
			
			getPtr(newStr,per+curr,list);
		}
	}
}
