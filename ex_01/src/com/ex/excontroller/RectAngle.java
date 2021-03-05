package com.ex.excontroller;

public class RectAngle {

	private int width;
	private int height;
	
	public RectAngle() {
		// TODO Auto-generated constructor stub
	}

	public RectAngle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void draw() {
		System.out.println("가로 "+width+"cm, 세로"+height+"cm 인 사각형을 그립니다.");
	}
}
