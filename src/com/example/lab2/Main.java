package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.lab2.Fruit.FruitComparator;
import com.example.lab2.Fruit.FruitComparatorDesc;

public class Main {
	public static void main(String[] args) {
		List<Fruit> fl=new ArrayList<Fruit>();
		
		System.out.println("Fruit List (orderd by name)");
		
		Fruit s1 = new Fruit(101,"Apple",1000);
		fl.add(s1);
		Fruit s2 = new Fruit(102,"Orange",1500);
		fl.add(s2);
		fl.add(new Fruit(103,"Kiwi",2000));
		fl.add(new Fruit(104,"Watermelon",9000));
		fl.add(new Fruit(105,"Banana",2000));
		fl.add(new Fruit(106,"Mango",2500));
		fl.add(new Fruit(107,"Grape",4500));
		fl.add(new Fruit(108,"Cherry",3000));
		fl.add(new Fruit(109,"Strawberry",6000));
		fl.add(new Fruit(110,"Blueberry",7000));
		
		Collections.sort(fl, new FruitComparator());
		for (Fruit s: fl) {
			System.out.println(s.toString());
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		for (int i=0 ; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
		
	}
}