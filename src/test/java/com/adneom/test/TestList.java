package com.adneom.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.adneom.list.SousList;

public class TestList {

	@Test
	public void testSousList() throws Exception{
		SousList sL = new SousList();
		List<Integer> laliste = new ArrayList<Integer>();
		laliste.add(1);
		laliste.add(2);
		laliste.add(3);
		laliste.add(4);
		laliste.add(5);
		laliste.add(6);
		laliste.add(7);
		laliste.add(8);
		final int length = 9;
		sL.extractOfList(laliste, length);
		List<List<Integer>> listAll = SousList.listAll;
		if(listAll!=null){		
			for(List<Integer> element: listAll){			
				if(laliste.size()%length != 0 && listAll.size()-1==listAll.lastIndexOf(element)){
					Assert.assertEquals((laliste.size()%length), element.size());
				}
				else{
					Assert.assertEquals(length , element.size());
				}
			}
		}		
	}
}
