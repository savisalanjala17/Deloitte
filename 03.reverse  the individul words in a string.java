// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        String s = "deloitte online test";
        String a[]=s.split(" ");
        
        
        
        for(int i=0 ;i <a.length;i++){
            a[i]=reverse(a[i]);
        }
        String neww=String.join(" ",a);
        System.out.print(neww);
        
    }
    
    public static String reverse(String v){
        
        char c []= v.toCharArray();
        
        int left=0;
        int right=c.length-1;
        
        while(left<right){
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            
            left++;
            right--;
        }
        
      return  new String (c);
    }
}
