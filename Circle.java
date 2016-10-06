package com.lvjike.bit.java;

public class Circle extends GeometircObject{
	private double radious;
	
	public Circle(){
		super();
	}
	public Circle(double radious,String color,boolean filled){
		super();
		this.radious=radious;
		setColor(color);
		setFilled(filled);
		
	}
	public double getRadious(){
		return this.radious;
	}
	public void setRadious(double radious){
		this.radious=radious;
	}
	@Override
	public String toString(){
		
		return "Circle[radious="+this.radious+" color="+
		this.getColor()+" isFilled? "+this.isFilled()+"!"+" area="+this.getAera()+
		" Created at "+this.getDateCreated()+". ]";
		
	}
	
	@Override
	public double getAera(){
		return Math.PI*this.radious*this.radious;
	}
	}



