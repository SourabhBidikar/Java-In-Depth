/*

Print Substring
Input: String
		begin and end
output: substring from begin to end index
*/




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substring1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        System.out.println(S.substring(start,end));
    }
}