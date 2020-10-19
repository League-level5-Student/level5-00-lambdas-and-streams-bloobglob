package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			for(int i = "backwards".length()-1; i >= 0; i--) {
				System.out.print("backwards".charAt(i));
			}
		}, "backwards");
		System.out.println();
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			for(int i = 0; i < "upper and lower".length(); i++) {
				if(i%2 == 0) {
					System.out.print(Character.toUpperCase("upper and lower".charAt(i)));
				}else {
					System.out.print(Character.toLowerCase("upper and lower".charAt(i)));
				}
			}
		}, "upper and lower");
		System.out.println();
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			for(int i = 0; i < "periods".length(); i++) {
				System.out.print("periods".charAt(i));
				System.out.print(".");
			}
		}, "periods");
		System.out.println();
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			for(int i = 0; i < "no vowels".length(); i++) {
				if("no vowels".charAt(i) != 'a' && "no vowels".charAt(i) != 'e' && "no vowels".charAt(i) != 'i' && 
						"no vowels".charAt(i) != 'o' && "no vowels".charAt(i) != 'u') {
					System.out.print("no vowels".charAt(i));
				}
			}
		}, "no vowels");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
