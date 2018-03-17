import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Apples {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		Map<String, Double> apples = new HashMap<String, Double>();
		System.out.print("How many types of apples?"
				+ " ");
		int n = scnr.nextInt();	
		System.out.println("Type one word color of the apple then space then digits.");
		
		for (int i = 0; i < n; i ++) {
			System.out.print("Apples " + (i + 1) + ": ");
			String name = scnr.next();
			//System.out.print("Apples " + (i + 1) + ": ");
			Double number = scnr.nextDouble();
			apples.put(name, number);
			System.out.println("");
		}
		System.out.print("Type name to search for number: ");
		String contact = scnr.next();
		
		for (String key : apples.keySet()) {
			if (key.equals(contact)) {
				//apples.forEach( (name, phNum) 	->	
				System.out.println("This is how much it cost $" + apples.get(key).intValue());
			}
		}
		System.out.println("");
		System.out.println("Apples List:");
	apples.forEach( (name, phNum) -> System.out.println(name + " apple cost is $ " + phNum.intValue()) );
		
	}

}
