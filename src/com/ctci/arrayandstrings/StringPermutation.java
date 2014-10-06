/**
 * 
 */
package com.ctci.arrayandstrings;

import java.util.ArrayList;

/**
 * @author Dinesh Appavoo
 *
 */
public class StringPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> res=new StringPermutation().findPerm("abc");
		for(String s : res)
		{
			System.out.println(s);
		}
	}
	
	public ArrayList<String> findPerm(String str)
	{
		if(str=="")
		{
			ArrayList<String> res=new ArrayList<String>();
			res.add("");
			return res;
		}
		if(str.length()==1)
		{
			ArrayList<String> res=new ArrayList<String>();
			res.add(str);
			return res;
		}
		char c=str.charAt(0);

		ArrayList<String> res=findPerm(str.substring(1));
		ArrayList<String> permList=new ArrayList<String>();
		for(String s : res)
		{
			int len=s.length();
			for(int i =0;i<=len;i++)
			{
				permList.add(placeChar(s,i,c));
			}
		}
		return permList;
	}
	
	public String placeChar(String str,int i,char c)
	{
		String first=str.substring(0,i);
		String last=str.substring(i);
		return first+c+last;
	}

}
