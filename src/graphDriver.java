import java.util.Scanner;

public class graphDriver {
	
	public static String input;
	
	public static void driverClass() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Commands for graphs:");
			System.out.println("Enter the command (graph) + a number from 1-7.");
			System.out.println("Example command: (graph1)");
	
			System.out.println("What graph would you like to see?: ");
			input = scan.nextLine();
			
			if (input.equals("graph1")) {
				System.out.println("Graph 1 content: ");
				carGraphs.mainTest1();
				break;
			}
			
			else if (input.equals("graph2")) {
				System.out.println("Graph 2 content: ");
				carGraphs2.mainTest2();
				break;
			}
			
			else if (input.equals("graph3")) {
				System.out.println("Graph 3 content: ");
				carGraphs3.mainTest3();
				break;
			}
			
			else if (input.equals("graph4")) {
				System.out.println("Graph 4 content: ");
				carGraphs4.mainTest4();
				break;
			}
			
			else if (input.equals("graph5")) {
				System.out.println("Graph 5 content: ");
				carGraphs5.mainTest5();
				break;
			}
			
			else if (input.equals("graph6")) {
				System.out.println("Graph 6 content: ");
				carGraphs6.mainTest6();
				break;
			}
			
			else if (input.equals("graph7")) {
				System.out.println("Graph 7 content: ");
				carGraphs7.mainTest7();
				break;
			}
			
			else if (input.equals("graph8")) {
				System.out.println("Graph 8 content: ");
				carGraphs8.mainTest8();
				break;
			}
			
			else if (input.equals("graph9")) {
				System.out.println("Graph 9 content: ");
				carGraphs9.mainTest9();
				break;
			}
			
			else {
				System.out.println("Command not recognized...");
			}
		}
		
	}
}
