/**
 * 
 */
package com.ctci.objectorienteddesign;

import java.util.ArrayList;

/**
 * @author Dany
 *
 */
public class Guest {

	int noOfTables;
	String guestName;
	ArrayList<Table> tableList=new ArrayList<Table>();
	public Guest(String guestName, int noOfTables)
	{
		this.guestName=guestName;
		this.noOfTables=noOfTables;
	}

	public int getNumberOfTables()
	{
		return noOfTables;
		
	}
	
	public void assignTableList(Table table)
	{
		tableList.add(table);
	}
	
	

}
