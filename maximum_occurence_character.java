import java.util.*;
public class test
{
    static  String s="my name is smita";
    public static void main(String[] args) {
        int max_val;
    HashMap <Character,Integer> h=new HashMap <Character,Integer>();
            for(int i=0;i<s.length();i++)
            { 
                if(s.charAt(i)!=' ')
                {
                    if((h.containsKey(s.charAt(i))) )
                    {
                        h.put(s.charAt(i), h.get(s.charAt(i)) + 1);
                    }
                    else
                    {
                    h.put(s.charAt(i), 1);
                    }  
                }  
        }
        System.out.println(h);   
        max_val=Collections.max(h.values());
        for ( Map.Entry<Character, Integer> entry : h.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (value==max_val){
                System.out.println("Maximum occurring character is: "+key+" with count as  "+value); 
            }
        }             
	}
}

            
