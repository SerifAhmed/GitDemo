package JavaPrograms;

//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,3,3,4,5,6,7,9,9,9};
        //Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();
        for (int n : arr) {
            set.add(n);
        }
        System.out.println("After removing duplicates: " + set);
    }
}

/*
 		int[] no={1,1,3,2,3,4,4};
        Arrays.sort(no);
        for(int i=0;i<no.length;i++){
            int j;
            for(j=0;j<i;j++){
                if(no[i]==no[j]){
                    break;
                }
            }
            if(i==j){
                System.out.print(no[i]+" ");
            }
        }
 */
