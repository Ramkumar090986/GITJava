package org.sample;

import java.util.Iterator;
import java.util.Vector;



public class JavaGIT {

		public static void main(String[] args) {
			Vector<String>v=new Vector<>();
			v.add("Saba");
	        v.add("Siva");
			v.add("Ram");
			
			Iterator<String> iterator = v.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
				
			}
			
		}
	}


