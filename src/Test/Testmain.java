/**
 * 
 */
package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeMap;

/**
 * @author Dinesh Appavoo
 *
 */

public class Testmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> aList=new ArrayList<Integer>();
		aList.add(10);
		aList.add(23);
		aList.add(10);
		System.out.println(aList.toString());
		
		HashSet<Integer> hSet=new HashSet<Integer>();
		hSet.add(10);
		hSet.add(23);
		hSet.add(10);
		System.out.println(hSet.toString());
		
		TreeMap<Integer, Integer> tMap=new TreeMap<Integer, Integer>();
		tMap.put(10, 10);
		tMap.put(23, 23);
		tMap.put(10, 10);
		tMap.put(5, 5);
		tMap.put(7, 7);
		tMap.put(1, 1);

		for(int key : tMap.keySet())
		{
			System.out.println("key  "+key+"   Value: "+tMap.get(key));
		}
		System.out.println(tMap.toString());
		
		
		String str="DInesh";
		StringBuffer sBuffer=new StringBuffer();
		char[] strArr=str.toCharArray();
		
		String str1="DInesh";
		char[] str1Arr=str1.toCharArray();
		Arrays.sort(str1Arr);
		String s1=new String(str1Arr);// String((Arrays.sort(str1Arr)));
		String s2=new String(Arrays.sort(str2Arr));

		System.out.println(().equals()););
		
	}

}
