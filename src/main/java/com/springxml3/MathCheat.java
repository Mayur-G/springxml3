package com.springxml3;

public class MathCheat implements Cheat{
	
	public MathCheat() {
		System.out.println("MathCheat Constr called");
}
	
//	public void mathCheat()
//	{
//		System.out.println("math cheat started");
//	}

	//cheat interface
	@Override
	public void cheat() {
		System.out.println("math cheat started");
	}
}
