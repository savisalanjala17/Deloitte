// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        String s = "deloitte online test";
        String a[]=s.split(" ");
        
        int max=0;
        int ind=0;
        
        for(int i=0 ;i <a.length;i++){
            String v = a[i];
            
            if(max<v.length()){
                max=v.length();
                ind=i;
            }
        }
        
        System.out.print(a[ind]);
    }
        
    }
