/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println("The addition of two variables is ");
		System.out.println("               " + x + "                 ");
		System.out.println("                +                 ");
		System.out.println("                " + y + "                 ");
		System.out.println("                =                 ");
		System.out.println("               " + (x + y) + "                 ");

	}
}