/* This is a test program to re-
familiarize myself with Java
programming */

// I'm importing necessary Java libraries here
import java.io.Console;
import java.util.Arrays;
import java.io.IOException;
import java.lang.*;
// I have to declare a class name that is the
// same name as the file. I called the file
// `test.java
public class test {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World");

		Console c = System.console();
		if (c == null) {
			System.err.println("No console.");
			System.exit(1);
		}

		String login = c.readLine("Enter your login username: ");
		char[] password = c.readPassword("Enter your password: ");

		//test method
		if (verify(login, password) == true){
			System.out.println("Access Enabled");
			System.out.println(login.substring(1,3));
		}
		else{
			System.out.println("Access Denied");
		}
	}

	public static boolean verify(String username, char[] password){
		char[] actual_pw = {'l','o','l'};
		Pair simplePair = new Pair("Eunice", actual_pw);
		if (Arrays.equals(simplePair.value(), password)){
			return true;
		}
		else {
			return false;
		}
	}
}
