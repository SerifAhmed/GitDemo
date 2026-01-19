package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumbers {

	public static void main(String[] args) {
		
		int[] arr={1,2,1,3,3,3,4,5,6,7,9,9,9};
		
        Map<Integer,Integer> countMap=new HashMap<>();
        
        for(int n:arr){
            countMap.put(n,countMap.getOrDefault(n,0)+1);
        }
        
        for(Map.Entry<Integer,Integer>entry:countMap.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue()+" times repeated");
        }
	}
}
