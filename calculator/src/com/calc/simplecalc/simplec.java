package com.calc.simplecalc;

public class simplec {
	int a,b,addition,subtract,sum;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int add()
	{
		this.addition=getA()+getB();
		return addition;
	}
	
	 public int sub()
	{
		this.subtract=getA()-getB();
		return subtract;
	}
	
}

