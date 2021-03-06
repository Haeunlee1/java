package com.ex.ex1;

import com.ex.excontroller.Circle;
import com.ex.excontroller.RectAngle;

public class ShapeMaker {

	public static void main(String[] args) {

		Circle[] c = new Circle[3];
		c[0] = new Circle(20);
		c[1] = new Circle(40);
		c[2] = new Circle(50);
		
		for(int i=0; i<c.length;i++) {
			c[i].draw();
		}
		System.out.println();
		
		RectAngle[] r = new RectAngle[2];
		r[0]= new RectAngle(20,20);
		r[1]= new RectAngle(50,60);
		
		for(int i=0; i<r.length;i++) {
			r[i].draw();
		}
		
		int random = (int)(Math.random()*4);
		System.out.println(random);
	}
	


}
