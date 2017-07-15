package com.calc.main;
import com.calc.simplecalc.*;
public class mainc extends simplec {
	int c,addition;
	mainc m=new mainc();
	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	public int adding()
	{
		this.addition=m.getA()+m.getB()+getC();
		return addition;
	}
	

}
