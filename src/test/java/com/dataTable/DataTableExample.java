package com.dataTable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public class DataTableExample {
	public static void main(String[] args) {
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++1-D without Header++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		List<String> a=new ArrayList<String>();
		a.add("Ram");
		a.add("Ram123@gmail.com");
		a.add("Java");
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++1-D with Header++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		Map<String,String> b=new LinkedHashMap<String,String>();
		b.put("name", "Ram");
		b.put("email", "ram123@gmail.com");
		b.put("course", "Java");
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++2-D without Header++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		List<ArrayList<String>> c =new ArrayList<ArrayList<String>>();
		ArrayList<String> c1= new ArrayList<String>();
		c1.add("Ram");
		c1.add("Ram123@gmail.com");
		c1.add("Java");
		c.add(c1);
		ArrayList<String> c2= new ArrayList<String>();
		c2.add("Sam");
		c2.add("Sam123@gmail.com");
		c2.add("Python");
		c.add(c2);
		ArrayList<String> c3= new ArrayList<String>();
		c3.add("John");
		c3.add("John123@gmail.com");
		c3.add("Selenium");
		c.add(c3);
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++2-D with Header++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		List<LinkedHashMap<String,String>> d =new ArrayList<LinkedHashMap<String,String>>();
		LinkedHashMap<String,String> d1=new LinkedHashMap<String,String>();
		d1.put("name", "Ram");
		d1.put("email", "Ram123@gmail.com");
		d1.put("course", "Java");
		d.add(d1);
		LinkedHashMap<String,String> d2=new LinkedHashMap<String,String>();
		d2.put("name", "Sam");
		d2.put("email", "Sam123@gmail.com");
		d2.put("course", "Python");
		d.add(d2);
		LinkedHashMap<String,String> d3=new LinkedHashMap<String,String>();
		d3.put("name", "John");
		d3.put("email", "John123@gmail.com");
		d3.put("course", "John");
		d.add(d3);
		
		System.out.println("\n1-D without Header");
		System.out.println(a);
		System.out.println("\n1-D with Header");
		System.out.println(b);
		System.out.println("\n2-D without Header");
		System.out.println(c);
		System.out.println("\n2-D with Header");
		System.out.println(d);
				
		
			}
}
