import java.util.Scanner;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        int l1=s.length();
        int l2=t.length();
        if(l1!=l2){
            return false;
        }
         String s1=s.toLowerCase();
         String t1=t.toLowerCase();
         int count;
         for(c:s1){
            for(d:t1){
                if(c==d){
                    count++;
                }
            }
         }
         if(count==l1){
            return true;
         }
    }
    public static void main(String[] args) {
        Scanner sc = new 
    }
}
