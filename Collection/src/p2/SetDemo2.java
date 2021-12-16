package p2;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {

		Set java = new HashSet();

		java.add("Java8");
		java.add("SpringBoot");
		java.add("Hibernate");
		java.add("Java8");
		java.add("RESTful");
		
		
		Set python = new HashSet();
		
		python.add("Python");
		python.add("DJango");
		python.add("ORM");
		python.add("MySql");
		python.add("RESTful");
		
		//add all -> Union
		
//		java.addAll(python);		
//		System.out.println(java);//[DJango, Hibernate, Java8, MySql, SpringBoot, ORM, RESTful, Python]
		
		//removeAll -> minus
		
//		java.removeAll(python);
//		System.out.println(java); //[Hibernate, Java8, SpringBoot]
		
		//retailAll -> intersection
		
		java.retainAll(python);
		System.out.println(java); //[RESTful]

	}

}
