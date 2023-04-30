package template.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHooks extends CaffieneBevrageWithHooks{
	
	
	void brew() {
		System.out.println(" Brewing the coffee");
	}
	
	void addCondiments() {
		System.out.println(" Add Sugar and Milk");
	}
	
	
	//overriding the hook
	public boolean customerWantsCondiment() {
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	private String getUserInput() {
		String answer = null;
		System.out.println("Would you like Milk and Tea");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		}catch(IOException ioe) {
			System.out.println("IO error trying to read your answer");			
		}
		
		if(answer == null)
			return "no";
		
		return answer;
	}

}
