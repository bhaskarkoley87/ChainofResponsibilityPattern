package com.bhk;

public class Multiplication implements Chain {

	private Chain nextInChain;
	
	@Override
	public void nextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	}

	@Override
	public void calculate(Numbers num) {
		if(num.getCalculationWanted().equalsIgnoreCase("mul")) {
			System.out.println(num.getNum1() + " * " + num.getNum2() + " = " + (num.getNum1()*num.getNum2()));
		}else {
			this.nextInChain.calculate(num);
		}
	}

}
