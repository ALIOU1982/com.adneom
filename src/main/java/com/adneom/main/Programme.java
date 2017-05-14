/**
 * 
 */
package com.adneom.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.adneom.list.SousList;

/**
 * @author barry
 *
 */
public class Programme {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws Exception 
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader file = new FileReader(args[0]);
		BufferedReader bf = new BufferedReader(file);
		String line = bf.readLine();
		List<Integer> list = new ArrayList<Integer>();
		int length = Integer.parseInt(line);
		line = bf.readLine();
		while (line != null)
		{
			String[] split = line.split(",");
			for(String l : split){
				list.add(Integer.parseInt(l));
			}
			SousList slist = new SousList();
			slist.extractOfList(list, length);
			System.out.print("La liste: "+list);	
			System.out.println(" de taille: "+length+" a pour sous liste:");
			if(!SousList.listAll.isEmpty()){
				System.out.println(SousList.listAll);
			}
			SousList.listAll = new ArrayList<List<Integer>>();
			list = new ArrayList<Integer>();
			line =  bf.readLine();
			if(line!=null){
				length = Integer.parseInt(line);
			}
			line = bf.readLine();
		}
		bf.close();
		file.close();
	}
}
