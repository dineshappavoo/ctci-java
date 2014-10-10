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


import java.util.Scanner;
public class SameReflection
{
    public static int isSameReflection(String word1, String word2){
        if(word1==null||word2==null)
        {
            return -1;
        }
        int word1Length=word1.length();
        int word2Length=word2.length();
        if(word1Length!=word2Length)
        {
            return -1;
        }
        if(word1Length>100||word2Length>100)
        {
            return -1;
        }
        if((word1.equals(""))||(word2.equals("")))
        {
            return -1;
        }
        String tempStr=word1+word1;
        if(tempStr.contains(word2))
        {
            return 1;
        }else
        {
            return -1;
        }
    }
    public static void main(String[] args)
    {
        String word1,word2;
        Scanner s= new Scanner(System.in);
        word1=s.next();
        word2=s.next();
        System.out.println(isSameReflection(word1,word2));
    }
}

