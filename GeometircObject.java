package com.lvjike.bit.java;

import java.util.Date;

public class GeometircObject {
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	public GeometircObject(){
		dateCreated=new Date();
		
	}
	public GeometircObject(String color,Boolean filled){
		 
		this.color=color;
		this.filled=filled;
	}
	public String getColor(){
		return this.color;
	}
	public void setColor(String color){
		this.color=color;
	}
	public boolean isFilled(){
		return this.filled;
	}
	public void setFilled(boolean filled){
		this.filled=filled;
	}
	public Date getDateCreated(){
		return this.dateCreated;
	}
	public String toString(){
		return "GeometircObject[color="+this.color+" isFilled? "
				+this.filled+"dateCreated: "+this.dateCreated+"]";
	}
	public double  getAera(){
		return 0;
	}
	
			
}
