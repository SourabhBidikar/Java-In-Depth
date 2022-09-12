/*
You are given q queries in the form of a,b and n . For each query, print the series corresponding to the given a, b, and n values as a single line 
of  space-separated integers.

Input Format

The first line contains an integer, q , denoting the number of queries.
Each line i of the q subsequent lines contains three space-separated integers describing the respective a,b , and n values for that query.

Constraints

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
*/
package hackerrank;
import java.util.*;
import java.io.*;
import java.math.*;

public class forloop_2{
    public static void main(String []argh){
         float q,a,b,n;
        Scanner sc= new Scanner(System.in);
        q=sc.nextInt();
        for(int i=0;i<q;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            n=sc.nextInt();
            for(int j=0;j<n;j++){
                float f=(float)Math.pow(2,j);
                a=a+f*b;
                System.out.print(Math.round(a)+" ");
            }
            System.out.println();
        } 
    
    }
}