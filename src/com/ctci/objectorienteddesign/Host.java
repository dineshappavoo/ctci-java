/**
 * 
 */
package com.ctci.objectorienteddesign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dany
 *
 */
public class Host extends Employee{

	private static Host _instance=null;
	public String hostId;

	public static Host getInstance()
	{
		if(_instance==null)
		{
			_instance= new Host();
		}
		return _instance;
	}

	private Host()
	{

	}

	static Queue<Guest> waitingList=new LinkedList<Guest>();
	static ArrayList<Table> availableTableList=new ArrayList<Table>();
	static HashMap<Guest, ArrayList<Table>> currentlyOccupiedMap=new HashMap<Guest, ArrayList<Table>>();

	public void addGuestToWaitingList(Guest guest)
	{
		waitingList.add(guest);
	}

	public boolean isTableAvailableforGuest(Guest guest)
	{
		int noOfTablesRequired=guest.noOfTables;
		if(availableTableList.size()>=noOfTablesRequired)
			return true;
		return false;
	}
	public boolean assignGuestToTable(Guest guest)
	{
		int noOfTablesrequired=guest.noOfTables;
		if(isTableAvailableforGuest(guest))
		{
			for (Iterator<Table> iterator = availableTableList.iterator(); iterator.hasNext(); ) 
			{
				Table table=iterator.next();
				guest.assignTableList(table);
				iterator.remove();
				noOfTablesrequired--;
				if(noOfTablesrequired==0)
					break;
			}
			waitingList.remove(guest);
			return true;
		}else
		{
			return false;
		}
	}
}
