package com.lvjinkebit.java;
/*
 * 一、类的第三个成员，构造器（constructor ）
 * constructor:建造者
 * 构造器的作用：①：创建对象②给创建的对象的属性赋值（初始化对象的属性）
 * 
 * 1.设计类时，如果不显示声明的构造器的话，程序会默认提供一个空参的构造器
 * 2.一旦显式的定义类的构造器，那么默认的构造器就不在提供。
 * 3.如何声明类的构造器。格式：权限修饰符  类名（形参）{}
 * 4.类的多个构造器构成重载
 * 二、类对象的属性的赋值先后顺序：①默认的初始化②属性的显式初始化
 * 						   ③通过构造器给属性初始化
 * 						   ④通过“对象.方法”的方式给属性赋值
 */

public class TestPerson {
	public static void main(String[] args){
		Person p1=new Person("lvjinke",20);
		System.out.println(p1.getName());
		
	}
	
}
		
class Person{
		
		//field
		private String name;
		private int age;
		
		//constructor
		public Person(){
			
		}
		public Person(String s,int n){
			name=s;
			age=n;
		}
		//method
		public void setName(String n){
			name=n;
		}
		public String getName(){
			return name;
		}
	}


