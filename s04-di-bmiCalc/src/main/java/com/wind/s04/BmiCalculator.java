package com.wind.s04;

public class BmiCalculator {
	
	private double low_weight;
	private double normal;
	private double over_weight;
	private double obesity;

	public void setLow_weight(double low_weight) { this.low_weight = low_weight; }
	public void setNormal(double normal) { this.normal = normal;}
	public void setOver_weight(double over_weight) { this.over_weight = over_weight; }
	public void setObesity(double obesity) { this.obesity = obesity;} 

	public void bmi_calculator(double weight, double height) {
		double h = height * 0.01;
		double result = weight / (h*h);
		
		System.out.println("BMI지수: " + (int)result);
		
		if(result>obesity) System.out.println("비만, 10일 단식하세요.");
		else if(result>over_weight) System.out.println("과체중, 3일 단식하세요.");
		else if(result>normal) System.out.println("정상입니다.");
		else System.out.println("저체중입니다. 많이 드세요.");
	}
}
