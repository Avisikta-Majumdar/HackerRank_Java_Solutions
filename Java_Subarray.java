package Java_Data_Structure;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Subarray {

    public static void main(String[] args) {
        int sum=0;
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;++i){
        a[i] = scan.nextInt();
        if(a[i]<0){sum++;}}
        for(int i=0;i<n-1;i++)
        {    for(int j=1+i;j<n;++j)
            {int temp=0;
                for(int k=i;k<=j;++k)
                {temp+=a[k];}
                if(temp<0){sum++;}
            }    
        }
        System.out.println(sum);
    }
}
