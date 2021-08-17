/* Climb Stairs
Easy  
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. In one move, you are allowed to climb 1, 2 or 3 stairs.
4. You are required to print the number of different paths via which you can climb to the top.
Input Format
A number n
Output Format
A number representing the number of ways to climb the stairs from 0 to top.
Constraints
0 <= n <= 20
Sample Input
4
Sample Output
7
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cp = countPathsTab(n);
        System.out.println(cp);      //cp-count paths
    }
public static int countPathsTab(int n ){
int[] dp = new int[n+1];

dp[0] = 1;
for(int i=1;i<=n;i++){
    if(i==1){
        dp[i] = dp[i-1];
    } else if(i==2){
        dp[i] = dp[i-1] + dp[i-2];
    } else{
        dp[i] = dp[i-1] +dp[i-2]+ dp[i-3];
    }
}
return dp[n];
}
}


