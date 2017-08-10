package com.example.randoma;

import java.util.*;
import java.lang.*;


public class RandomaApplication {

	public static void main(String[] args) {

		ArrayDeque<String>aQueue = new ArrayDeque<String>();
		for(int n=0; n<50; n++) {

			Random generator = new Random();
			int randNum = generator.nextInt(50)+1;

			char[] aChar = new char[randNum];
			Arrays.fill(aChar,'a');
			String result = new String(aChar);
			aQueue.offer(result + "\n") ;
		};

		System.out.println("aQueue: \n"  + aQueue);

		Separator separator = new Separator();
		separator.separateOddEven(aQueue);
	}
}
