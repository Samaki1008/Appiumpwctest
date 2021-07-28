import com.sun.xml.internal.fastinfoset.util.CharArray;
import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.HashMap;

public class NumberOcc {

    public static void main(String[] args){
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        String sam = "selenium";
        char[] array = sam.toCharArray();
        char target ='o';
        int len = sam.length();
        int counter=0;

        for(int i=0; i<len;i++){
            if(array[i]==target){
                //System.out.println("match");
                counter++;
               // System.out.println(hash);
                hash.put(target,counter);

            }


        }
        System.out.println(hash);





    }



}
