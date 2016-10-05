package com.lvjinkebit.java;

import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args){
//		System.out.println("please enter the slid1");
//		Scanner input1=new Scanner(System.in);
//		double slid1=input1.nextDouble();
//		System.out.println("please enter the slid2");
//		Scanner input2=new Scanner(System.in);
//		double slid2=input2.nextDouble();
//		System.out.println("please enter the slid3");
//		Scanner input3=new Scanner(System.in);
//		double slid3=input3.nextDouble();
//		System.out.println("please enter the color of the Triangle");
//		Scanner input4=new Scanner(System.in);
//		String color=input4.nextLine();
//		System.out.println("Is the Triangle filled£¿true or false");
//		Scanner input5=new Scanner(System.in);
//		boolean filled=input5.nextBoolean();
		System.out.println("Please the slids and color and if the triangle is filled?ture or false");
		Scanner input=new Scanner(System.in);
		String infor=input.nextLine();
		String[] s=infor.split(" ");
		double slid1=Double.parseDouble(s[0]);
		double slid2=Double.parseDouble(s[1]);
		double slid3=Double.parseDouble(s[2]);
		String color=s[3];
		boolean filled=Boolean.parseBoolean(s[4]);
		
		Triangle t=new Triangle(slid1,slid2,slid3);
		t.setColor(color);

		t.setBoolean(filled);
		if(slid1+slid2<=slid3||slid1+slid3<=slid2||slid2+slid3<=slid1)
			System.out.println("The slids you input can't make a triangle");
		else{
			
			System.out.println("The Primeter is: "+t.getPrimeter()+"&&"+"The color is: "+t.getColor());
			System.out.println(t.toString());
			if(filled)
			System.out.println("The Triangle is filled");
			else
			System.out.println("The Triangle is not filled");}
				
		
	}

}
class GeometricObject{
	private boolean filled;
	private String color;
	public GeometricObject(){
		//super();
		}
	public GeometricObject(boolean filled,String color){
		this.filled=filled;
		this.color=color;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return this.color;
	}
	public void setBoolean(boolean filled){
		this.filled=filled;
	}
	public boolean getBoolean(){
		return this.filled;
	}
}
class Triangle extends GeometricObject{
	private double side1=1.0;
	private double side2=1.0;
	private double side3=1.0;
	
	public Triangle(){
		super();
	}
	public Triangle(double side1,double side2,double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;	
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	public double getPrimeter(){
		return this.side1+this.side2+this.side3;
	}
	public String toString(){
		return "Triangle: side1= "+side1+" side2="+side2+" side3="+side3;
		
	}
	
	
}
	
	

//	public GeometricObject(boolean filled, String color) {
//		super();
//		this.filled = filled;
//		this.color = color;
//	}
//
//	
//}
