import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		S_Witcher switcher =  new S_Witcher();
		while(true) {
			System.out.println("Press I to increase temprature");
			System.out.println("Press D [hehe] to decrease temprature");
			System.out.println("");
			String s = getLine();
			if(s.equalsIgnoreCase("I")) {
				switcher.increase_temp();
			} else if(s.equalsIgnoreCase("d")) {
				switcher.decrease_temp();
			} else {
			    System.out.println("I THINK YOU HAVE C#R#NA THAT'S WHY YOU CAN'T FOLLOW SIMPLE INSTRUCTIONS");
			}
		}
	}
	
	 static String getLine() {
	        Scanner s =  new Scanner(System.in);
	        return s.next();
	    }
}
