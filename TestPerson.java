package com.lvjinkebit.java;
/*
 * һ����ĵ�������Ա����������constructor ��
 * constructor:������
 * �����������ã��٣���������ڸ������Ķ�������Ը�ֵ����ʼ����������ԣ�
 * 
 * 1.�����ʱ���������ʾ�����Ĺ������Ļ��������Ĭ���ṩһ���ղεĹ�����
 * 2.һ����ʽ�Ķ�����Ĺ���������ôĬ�ϵĹ������Ͳ����ṩ��
 * 3.���������Ĺ���������ʽ��Ȩ�����η�  �������βΣ�{}
 * 4.��Ķ����������������
 * �������������Եĸ�ֵ�Ⱥ�˳�򣺢�Ĭ�ϵĳ�ʼ�������Ե���ʽ��ʼ��
 * 						   ��ͨ�������������Գ�ʼ��
 * 						   ��ͨ��������.�������ķ�ʽ�����Ը�ֵ
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


