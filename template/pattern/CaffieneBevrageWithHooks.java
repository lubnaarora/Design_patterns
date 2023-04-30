package template.pattern;

public abstract class CaffieneBevrageWithHooks {
	
	final void prepareRecepie(){
		boilWater();
		brew();
		pourInCup();
		
		if(CustomerWantCondiments()) {
			addCondiments();
		}
		
		
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("boilWater");
	}
	
	void pourInCup() {
		System.out.println(" pourInCup");
	}

	boolean CustomerWantCondiments() {
		return true;
	}
}
