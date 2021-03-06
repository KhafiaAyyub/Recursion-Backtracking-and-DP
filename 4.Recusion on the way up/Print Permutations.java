/* Print Permutations
Easy  

1. You are given a string str.
2. Complete the body of printPermutations function - to calculate and print all permutations of str.

Input Format
A string str

Output Format
Permutations of str in order hinted by Sample output

Constraints
0 <= str.length <= 7

Sample Input
abc

Sample Output
abc
acb
bac
bca
cab
cba

*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    printPermutations(str,"");
    }
                                                
    public static void printPermutations(String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        
        for(int i=0;i< str.length();i++){
            char ch = str.charAt(i);
            String ros = str.substring(0,i) + str.substring(i+1);
            printPermutations(ros,asf+ch);
        }
    }

}

