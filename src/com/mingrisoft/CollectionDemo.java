package com.mingrisoft;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Set<People> hashSet=new HashSet<People>();
	hashSet.add(new People("陈同学",201101));
	hashSet.add(new People("王同学",201102));
	hashSet.add(new People("李同学",201103));
	Iterator<People> it=hashSet.iterator();
	System.out.println("集合中的元素是：");
	while(it.hasNext()) {
		People person=it.next();
		System.out.println(person.getName()+" "+person.getId_card());
	}
	}

}
