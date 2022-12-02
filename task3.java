import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class task3 {
	public static void main(String[] args) throws java.io.IOException
	{
		Logger logger = Logger.getLogger(task3.class.getName());
        FileHandler fh = new FileHandler("log_03.txt", true);
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);



		try (Scanner sc = new Scanner(System.in)) {
            // taking input from the user using the Scanner class
            
            System.out.print(
            	"Enter the first and the Second number - ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            // selecting the operand for the calculations
            System.out.print(
            	"Choose and Enter the type of operation you want to perform (+, -, *, /, %) - ");
            char op = sc.next().charAt(0);
            solve(a, b, op);
        }
	}
	public static int solve(int a, int b, char op)
	{
		int ans = 0;
		// addition
		if (op == '+') {
			ans = a + b;
			// subtraction
		}
		else if (op == '-') {
			ans = a - b;
			// multiplication
		}
		else if (op == '*') {
			ans = a * b;
			// modulo
		}
		else if (op == '%') {
			ans = a % b;
			// division
		}
		else if (op == '/') {
			ans = a / b;
		}

		// printing the final result
		System.out.println("Your answer is - " + ans);
		return ans;
	}
}
