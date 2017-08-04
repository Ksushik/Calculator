
public class Calculator {

	public static int getSumm(int a, int b) {
		return a + b;
	}

	public static int getDiff(int a, int b) {
		return a - b;
	}

	public static int getMult(int a, int b) {
		return a * b;
	}

	public static int getDev(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		switch (args[1]) {
			case "+": {
				System.out.println(getSumm(Integer.parseInt(args[0]), Integer.parseInt(args[2])));
				break;
			}
			case "-": {
				System.out.println(getDiff(Integer.parseInt(args[0]), Integer.parseInt(args[2])));
				break;
			}
			case "x": {
				System.out.println(getMult(Integer.parseInt(args[0]), Integer.parseInt(args[2])));
				break;
			}
			case "/": {
				System.out.println(getDev(Integer.parseInt(args[0]), Integer.parseInt(args[2])));
				break;
			}
			default: {
				System.out.println("You've entered incorrect values");
				break;
			}
		}
	}
}

