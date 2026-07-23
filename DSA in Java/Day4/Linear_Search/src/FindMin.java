public class FindMin {
    public static void main(String[] args) {
        int[] arr = {2, 18, 1, 5, 14};
        System.out.println(minimum(arr));
    }

    public static int minimum(int[] arr){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
                return min;
            }
        }
        return Integer.MAX_VALUE;
    }
}
