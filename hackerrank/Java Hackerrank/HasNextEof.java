/*
To take unlimited lines of input till eof and print the same with Line numbering
hasNext() method of Scanner class is important here.
*/

import java.io.*;
import java.util.*;

public class HasNextEof {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n=0;
        while(sc.hasNext()){
            String x=sc.nextLine();
            n++;
            System.out.println(n+" "+x);
            
        }
    }
}