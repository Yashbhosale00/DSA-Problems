public class LargestInArray {
    public static void main(String[] args) {
        int [] numbers = {101,11,12,100,15,90};
        int largest = findLargest(numbers);
        System.out.println("Largest element: " + largest);

    }
    public static int findLargest(int[]array){
        int largest = array[0];
        for(int num: array){
            if (num > largest) {
                largest = num;
                
            }
        }
        return largest;
    }
}
