import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String e,o;e=o="";
        char ch[]=(sc.next()).toCharArray();
        for(int j=0;j<ch.length;j++)
        {
            if(j%2==0)
            e=e+ch[j];
            else
            o=o+ch[j];
        }
        System.out.println(e+" "+o);
        }
    }
}

