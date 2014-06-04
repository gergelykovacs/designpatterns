/**
 * A simple Shape type: Circle.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.flyweight;

import be.whatshould.designpatterns.structural.flyweight.ShapeInterface;

public class Circle implements ShapeInterface {
	
	private int x = 0;
	private int y = 0;
	private int r = 0;
	private String color = null;
	
	public Circle(String c) {
		color = c;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setR(int r) {
		this.r = r;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getR() {
		return r;
	}
	
	public String getColor() {
		return color;
	}

	@Override
	public void draw() {
		System.out.println(color +" Circle is drawn at ("+ x +", "+ y +") with radius: "+ r +".");
	}
}