package lab;

import java.util.HashMap;
import java.util.Map;

public class Temp {

    public static void main(String[] args){
        System.out.println(factorial(4));
        System.out.println(factorial_recursion(4));


        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();

        hashMap.put("M",23);
        hashMap.put("P",34);
        hashMap.put("C",49);

        int temp=0;
        int count=0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
            temp = entry.getValue() + temp;
            count = count +1;

        }

        System.out.println(temp/count);
    }

    public static int factorial(int num){
        int result = 1;
        for (int i=1;i<num;i++){
            result = result * (i+1);
        }
        return result;
    }



    public static int factorial_recursion(int num){
        if (num>0){
            int result = num * factorial_recursion((num-1));
            return result;
        }else{
            return 1;
        }

    }
}
