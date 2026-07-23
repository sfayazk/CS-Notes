public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2, 18, 1, 5, 14};
        int target = 14;
        System.out.println(search(arr, target, 1, 3));
    }

    // search in the rage of index 1 to 3
    public static int search(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int i = start; i<end; i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
