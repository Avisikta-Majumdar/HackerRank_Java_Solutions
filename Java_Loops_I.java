package Java_Introduction;

import java.util.Scanner;

public class Java_Loops_I {
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        int i=1;
	        for(i=1;i<11;++i)
	        {
	            System.out.println(N+" x "+i+" = "+(N*i));
	        }

	        scanner.close();
	    }
}
