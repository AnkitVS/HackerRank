import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Stack <Integer> s= new Stack<>();
        Stack <Integer> t= new Stack<>();
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int max = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int c=in.nextInt();
            if(c==1)
            {
                int r=in.nextInt();
                s.push(r);
                if(t.isEmpty())
                    t.push(r);
                else
                    t.push(Math.max(r,t.peek()));
            }
            else if(c==2)
                {
                    s.pop();
                    t.pop();
                }
            else if(c==3)
                System.out.println(t.peek());
        }            
    }
}
