package template.pattern;

public class BeverageWithTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Testing with Hooks !!!!!");
		TeaWithHooks teaHook = new TeaWithHooks();
		CoffeeWithHooks coffeeHook = new CoffeeWithHooks();
		
		System.out.println("Making Tea");
		teaHook.prepareRecepie();
		
		System.out.println(" ************************************************");
		
		System.out.println("Making Coffee");
		coffeeHook.prepareRecepie();
		
		
		System.out.println(" Finished with Hooks !!!!!");
	}

}
