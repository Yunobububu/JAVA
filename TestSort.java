package com.lvjinkebit.java2;

public class TestSort {
	
	public static void main(String[] args){
		QuadraticEquation f1=new QuadraticEquation(1,8,16);
		if(f1.getDiscriminant()<0)
			System.out.println("The quation has no root");
		else if(f1.getDiscriminant()==0){
			System.out.println(f1.getRoot1());
		}
		else
			System.out.println("root1= "+f1.getRoot1()+"root2= "+f1.getRoot2());
		
	}
		
		
		
	

}
