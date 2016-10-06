package com.lvjike.bit.java;

public class Rectangle extends GeometircObject{
	private double width;
	private double height;
	
	public Rectangle(){
		super();
	}
	public Rectangle(double width,double height){
		super();
		this.width=width;
		this.height=height;
		
		
	}
	public Rectangle(double width,double height,String color,boolean filled){
		super();
		this.width=width;
		this.height=height;
		setColor(color);
		setFilled(filled);
		
	}
	public double getWidth(){
		return  this.width;
	}
	public double getHeight(){
		return this.height;
	}
	public void setWidth(double width){
		this.width=width;
	}
	public void setHeight(double height){
		this.height=height;
	}
	@Override
	public double getAera(){
		return this.width*this.height;
	}
	public double getPirmeter(){
		return 2*(this.width+this.height);
	}
	@Override
	public String toString(){
		return "Rectangle[width="+this.width+" height="+this.height+
			" The aera is "+this.getAera()+" the color is "+this.getColor()+"]";
	}
	

}
