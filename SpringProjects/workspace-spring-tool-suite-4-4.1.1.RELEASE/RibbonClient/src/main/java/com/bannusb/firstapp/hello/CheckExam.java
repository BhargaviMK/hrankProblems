package com.bannusb.firstapp.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CheckExam {

	
	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(1,1,1,1);
		int n=li.size();
		int m=2;
		int fc=0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i : li) {
		if(hm.containsKey(i))
		hm.put(i, hm.get(i)+1);
		else
		hm.put(i, 0);
		}
		
		for(int i : hm.keySet()) {
			if(hm.get(i)<=m)
				fc++;
		}
		
		System.out.println(fc);
		
		ArrayList al = new ArrayList();
//		al.add(3);
//		al.add(2, "d");
//		System.out.println(al);
		
		int a[][] = new int[3][3];
		a[0]=new int[1];
		a[1]=new int[2];
		a[2]=new int[3];
		
		int s =0;
		for(int i=0;i<3;i++) 
			for(int j=0;j<i+1;++j) 
				a[i][j]=j+1;
			for(int i=0;i<3;i++) 
				for(int j=0;j<i+1;++j) 
					s+=j+1;
			System.out.println(s);		
		
			
			
	}
}
