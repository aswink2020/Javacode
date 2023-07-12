import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        if(n>=-100 && n<=100){
            String name = Integer.toString(n);
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
