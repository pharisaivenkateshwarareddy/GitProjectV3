package PatternPackage;

import java.util.Scanner;

public class Pattern2 {
	public static void main() {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n+1;i++){
        for(int j=0;j<i;j++)
        System.out.print("*");
        for(int k=i;k<(n*2)-i;k++)
        System.out.print(" ");
        for(int p=0;p<i;p++)
        System.out.print("*");
        System.out.println();
    }
    for(int i=0;i<n-1;i++){
        for(int j=n-i-1;j>0;j--)
        System.out.print("*");
        for(int k=0;k<=i*2+1;k++)
        System.out.print(" ");
        for(int p=n-i-1;p>0;p--)
        System.out.print("*");
        System.out.println();
    }
	}
}
