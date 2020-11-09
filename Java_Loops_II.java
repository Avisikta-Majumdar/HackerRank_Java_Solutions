package Java_Introduction;
import java.util.*;
public class Java_Loops_II {
	public static int res(int a,int b, int n)
    {    int sum = a,i=1, j = 0;
        if (n==1)
        {return (a+(1*b));}
        else
        {for(;j<n;++j)//a b n      5  3  2
            {sum +=(i*b);i*=2;}
            return sum;
        }
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=1;j<=n;++j)
            {
                int m = res(a , b, j);
                System.out.print(m+" ");
                if(j==(n))
                {
                    System.out.println();
                }
                else
                {
                    continue ; 
                }
            }
        }
        in.close();
    }
}
