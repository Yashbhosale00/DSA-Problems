import java.util.HashSet;

public class DuplicateInArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,5,6,2,1};

        HashSet<Integer> set = new HashSet<>();
        System.out.println("Duplicate Element:");
        
        for(int i:arr){
            if (!set.add(i)) {
                System.out.println(i);
            }
        }
    }
}
