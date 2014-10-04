/**
 * 
 */
package com.ctci.arrayandstrings;

/**
 * @author Dany
 *
 */
public class ArrayRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={7,1,2,3,4};

		int res= new ArrayRotation().findRotationPoint(arr, 0, arr.length-1) ;
		System.out.println(res);
	}

	public int findRotationPoint(int[] arr, int low, int high)
	{

		int mid=(low+high)/2;
		if(arr[mid]>arr[high])
			return findRotationPoint(arr, mid+1, high);
		else if(arr[mid]<arr[high])
			return findRotationPoint(arr, low, mid);
		else
			return arr[low];

	}

}
