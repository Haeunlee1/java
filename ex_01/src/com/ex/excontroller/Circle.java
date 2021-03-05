package com.ex.excontroller;

import java.lang.Math;

public class Circle {

	public static final double PI=Math.PI;
	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("반지름 "+radius+"cm인 원을 그립니다.");
	}
	
}
