package com.lvjinkebit.java;
/*
 * this:
 * 1.���������������ԡ�������������
 * 2.this�������Ϊ��ǰ���ڴ����Ķ��󣬱���this.name,this.show();
 * 3.�����ڹ�������ͨ����this���βΣ����ķ�ʽ��ʾ�ĵ��ñ������������ص�ָ���Ĺ�������
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
