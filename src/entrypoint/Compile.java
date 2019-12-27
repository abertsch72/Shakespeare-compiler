/**
 * @author abertsch72
 * 
 * Entrypoint to compile a file. Takes a text file containing 
 * Shakespeare code as a command-line argument. If no command-line
 * arguments, prompts for the file name instead.
 */
package entrypoint;

import java.util.Scanner;

public class Compile {
	public static void main(String[] args) {
		String filePath;
		if(args.length == 0) {
			System.out.println("ERROR: must specify file. What do you want to compile? ");
			Scanner in = new Scanner(System.in);
			filePath = in.next();
			in.close();
		} else {
			filePath = args[0];
		}
	}
}
