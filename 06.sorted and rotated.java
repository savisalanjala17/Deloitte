// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        int count=0;
        
        int a [] = {1,2,3,4,5};
        
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                count++;
            }
        }
        
        if(a[a.length-1]>a[0]){
            count++;
        }
        
        if(count<=1) System.out.print("true");
        else System.out.print("false");
    }
        
    }
