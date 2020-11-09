package Java_Introduction;

import java.util.Scanner;

public class Java_Output_Formatting {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            int len = s1.length();
            System.out.print(s1);
            for(int k = 1;k<=(15-len);++k)
            {
                System.out.print(" ");
            }
            int length = 0;
            long temp = 1;
            while (temp <= x) {
                length++;
                temp *= 10;
            }
            if(length == 3)
            {
                System.out.print(x );
            }
            else if (length == 2)
            {
                System.out.print("0"+x);
            }
            else if (length == 1)
            {
                System.out.print("00"+x);
            }
            else
            {
                System.out.print("000");
            }
            System.out.println();

        }
        System.out.println("================================");

}
}
