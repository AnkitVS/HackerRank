import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Stack<Integer> in = new Stack<>();
     Stack<Integer> out = new Stack<>();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++) 
    {
        int c=sc.nextInt();
        if(c==1)
            in.push(sc.nextInt());

        else if(c == 2) {
                if(out.isEmpty()) {
                    while(!in.isEmpty()) {
                        out.push(in.pop());
                    }
                }  
                out.pop();
            }

        else if(c == 3) {
               if(out.isEmpty()) {
                    while(!in.isEmpty()) {
                        out.push(in.pop());
                    }
               }
               System.out.println(out.peek()); 
            }
    }
}
}
