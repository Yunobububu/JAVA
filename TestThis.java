package com.lvjinkebit.java;
/*
 * this:
 * 1.可以用来修饰属性、方法、构造器
 * 2.this可以理解为当前正在创建的对象，比如this.name,this.show();
 * 3.可以在构造器中通过“this（形参）”的方式显示的调用本类中其他重载的指定的构造器；
 */
public class TestThis {
	public static void main(String[] args){
		Personn p1=new Personn();
		p1.setPerson("lvinke",20);
		System.out.println(p1.getName()+" is "+p1.getAge()+" years old");
		
	}
}
class Personn{
	private String name;
	private int age;
	public Personn(){
		
	}
	public Personn(String name,int age){
		this.name=name;
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public void setPerson(String name,int age){
		this.name=name;
		this.age=age;
	}
	
}
