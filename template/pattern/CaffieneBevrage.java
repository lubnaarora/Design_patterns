package template.pattern;

public abstract class CaffieneBevrage {
	
	final void prepareRecepie() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	//Following methods should be 
	//overridden by Tea and Coffee
	
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println(" Boiling the water");
	}
	
	
	
	void pourInCup() {
		System.out.println(" Pouring in the Cup ");
	}
}
