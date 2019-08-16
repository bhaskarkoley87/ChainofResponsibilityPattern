package com.bhk.test;

import com.bhk.Addition;
import com.bhk.Chain;
import com.bhk.Division;
import com.bhk.Multiplication;
import com.bhk.Numbers;
import com.bhk.Substration;

public class Application {

	public static void main(String[] args) {
		Chain chn1 = new Addition();
		Chain chn2 = new Substration();
		Chain chn3 = new Multiplication();
		Chain chn4 = new Division();
		
		chn1.nextChain(chn2);
		chn2.nextChain(chn3);
		chn3.nextChain(chn4);
		chn4.nextChain(chn1);
		
		Numbers num = new Numbers(4, 2, "div");		
		chn1.calculate(num);
		
		
		Numbers num2 = new Numbers(4, 2, "add");		
		chn2.calculate(num2);
	}

}
