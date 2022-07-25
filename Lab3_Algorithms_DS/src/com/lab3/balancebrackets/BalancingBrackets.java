package com.lab3.balancebrackets;

import java.util.Stack;

public class BalancingBrackets {
	static boolean checkBalancingBrackets(String strBrackets) {
		boolean result = true;
		boolean validchar = true;
		Stack<Character> bracketStack = new Stack<Character>();
		for(int i=0;i<strBrackets.length();i++) {
			char charOfString = strBrackets.charAt(i);
			if(charOfString == '(' || charOfString == '[' || charOfString =='{'){
				bracketStack.push(charOfString);
				continue;
			}
			
			if(bracketStack.isEmpty()) {
				return false;
			}
			
			char poppedChar;
			switch (charOfString) {
			case ')':
				poppedChar = bracketStack.pop();
				if(poppedChar == '[' || poppedChar == '{')
					return false;
				break;
			case '}':
				poppedChar = bracketStack.pop();
				if(poppedChar == '[' || poppedChar == '(')
					return false;
				break;
			case ']':
				poppedChar = bracketStack.pop();
				if(poppedChar == '(' || poppedChar == '{')
					return false;
			break;
			}
		}
		
		return (bracketStack.isEmpty());
	}
	
	
	public static void main(String[] args) {
		String strBracketToCheck="([[{}]])";
		boolean result;
		result = checkBalancingBrackets(strBracketToCheck);
		if(result) {
			System.out.println("The entered String has Balanced Brackets");
		}else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}
