package com.adneom.list;

import java.util.List;
import java.util.ArrayList;

public class SousList {

	private int lenghtOflist;

	private List<Integer> listOfInteger;

	public static List<List<Integer>> listAll = new ArrayList<List<Integer>>();

	/**
	 * @return the lenghtOflist
	 */
	public int getLenghtOflist() {
		return lenghtOflist;
	}

	/**
	 * @param lenghtOflist the lenghtOflist to set
	 */
	public void setLenghtOflist(int lenghtOflist) {
		this.lenghtOflist = lenghtOflist;
	}

	/**
	 * @return the listOfInteger
	 */
	public List<Integer> getListOfInteger() {
		return listOfInteger;
	}

	/**
	 * @param listOfInteger the listOfInteger to set
	 */
	public void setListOfInteger(List<Integer> listOfInteger) {
		this.listOfInteger = listOfInteger;
	}

	/**
	 * @param lenghtOflist
	 * @param listOfInteger
	 */
	public SousList(int lenghtOflist, List<Integer> listOfInteger) {
		this.lenghtOflist = lenghtOflist;
		this.listOfInteger = listOfInteger;
	}

	/**
	 * 
	 */
	public SousList() {
	}

	public void extractOfList(List<Integer> listInteger, int length){

		if(listInteger.size() <= length){ 
			System.out.println("La taille de la liste doit être superieur au nombre d'élement maximum d'une sous liste");
		}
		else{
			List<Integer> sList = new ArrayList<Integer>();
			for(Integer element: listInteger){	
				sList.add(element);
				if(sList.size() == length || listInteger.size()-1==listInteger.lastIndexOf(element)){
					listAll.add(sList);
					sList = new ArrayList<Integer>();
				}
			}
		}		

	}
}
