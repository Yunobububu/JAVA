package com.lvjike.bit.java;

public class Test {
	public static void main(String[] args){
		Circle circle=new Circle(2,"green",true);
		Rectangle rectangle=new Rectangle(2*Math.PI,2,"yellow",true);
		System.out.println(equalAera(circle,rectangle));
		System.out.println(displayAera(circle));
		System.out.println(circle.toString());
		

	}
	public static boolean equalAera(GeometircObject g1,GeometircObject g2){
		return g1.getAera()==g2.getAera();
	}
	public static double displayAera(GeometircObject g){
		return g.getAera();
	}
		
	}	


