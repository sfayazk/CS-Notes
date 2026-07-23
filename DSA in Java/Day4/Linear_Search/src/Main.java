//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 45, 89, 50, 60};
        int target = 10;
//        int answer = linearsearch(arr, target);
        boolean answer = linearsearch(arr, target);
        System.out.println(answer);
    }
        //return index


//    public static int linearsearch(int[] arr, int target){
//        if(arr.length==0){
//            return -1;
//        }
//        for(int i = 0; i<arr.length; i++){
//            int element = arr[i];
//            if(element == target){
//                return i;
//            }
//
//        }
//        return -1;
//    }
        //return element


//    public static int linearsearch(int[] arr, int target){
//        if(arr.length==0){
//            return -1;
//        }
//        for (int element : arr) {
//            if (element == target) {
//                return element;
//            }
//
//        }
//        return Integer.MAX_VALUE;
//    }

    //return true or false

    public static boolean linearsearch(int[] arr, int target){
        if(arr.length==0){
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }

        }
        return false;
    }
}
