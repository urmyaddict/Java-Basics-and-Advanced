package com.java11.exercises;

class Point {

	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Method to obtain distance of a point w.r.t origin
	public double distance() {
		// code here
		double distance;
		distance = Math.round(Math.sqrt( Math.pow(this.x,2) + Math.pow(this.y, 2))*100)/100.0;
		return distance;
		
	}

	// Method to obtain distance of a point w.r.t another point
//	public double distance(Point point) {
//		// code here
//	}

}

public class exercise_1_OOPS {
	public static void main(String[] args) {
		// code here
		Point p1 = new Point(2,3);
		System.out.println(p1.distance());
	}
}
