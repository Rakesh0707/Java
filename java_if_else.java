Task 
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        String ans="";
        if(n%2==1){
            ans="Weird";
        }
        else
        {
            if(n>=2 &&n<=5)
            ans="Not Weird";
            else if(n>=6 &&n<=20)
            ans="Weird";
            else
            ans="Not Weird";
            
        } 
         System.out.println(ans);
        scanner.close();
    }
}

