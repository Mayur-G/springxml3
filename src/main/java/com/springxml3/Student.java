package com.springxml3;

public class Student {

//	private int id;
//	private MathCheat mathCheat;
//	
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public MathCheat getMathCheat() {
//		return mathCheat;
//	}
//
//	public void setMathCheat(MathCheat mathCheat) {
//		this.mathCheat = mathCheat;
//	}
//
//	public void cheating()
//	{
//		mathCheat.mathCheat();
//		System.out.println("id is : "+id);
//	}
	
	//cheat interface
	private Cheat cheat;

	public Cheat getCheat() {
		return cheat;
	}

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	
	public void cheating()
	{
		cheat.cheat();
	}
	
	
}
