import java.util.*;
class Main {
    public static void main(String[] args) {
        String s = "aabbbccddde";
        
        HashMap<Character,Integer> h = new LinkedHashMap<>();
        for(char c : s.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        
        int maxvalue=-1;
        char maxkey='a';
        
        for(Map.Entry<Character,Integer> entry : h.entrySet()){
            
            if(entry.getValue()>maxvalue){
                
                maxvalue=entry.getValue();
                maxkey=entry.getKey();
                
            }
        }
        
        System.out.print(maxkey);
        
    }
}
