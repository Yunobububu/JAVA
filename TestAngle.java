package com.lvjinkebit.java;

public class TestAngle {
	public static void main(String[] args){
		TriAngle angle=new TriAngle();
		angle.setBase(1.4);
		angle.setHeight(3.5);
		System.out.println("The aera of angel is "+angle.findAera());
		
	}
}
class TriAngle{
	private double base;
	private double height;
	
	public double getBase(){
		return base;
	}
	public double getHeight(){
		return height;
	}
	public void setBase(double base){
		this.base=base;
	}
	public void setHeight(double height){
		this.height=height;
	}
	public double findAera(){
		return this.base*this.height/2;
	}
}
