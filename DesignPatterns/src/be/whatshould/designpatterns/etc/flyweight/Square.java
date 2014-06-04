/**
 * A simple Shape type: Square.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.flyweight;

import be.whatshould.designpatterns.structural.flyweight.ShapeInterface;

public class Square implements ShapeInterface {
	
	private int x = 0;
	private int y = 0;
	private int w = 0;
	private String color = null;
	
	public Square(String c) {
		color = c;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setW(int w) {
		this.w = w;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getW() {
		return w;
	}
	
	public String getColor() {
		return color;
	}

	@Override
	public void draw() {
		System.out.println(color +" Square is drawn at ("+ x +", "+ y +") and wdith: "+ w +".");
	}
}