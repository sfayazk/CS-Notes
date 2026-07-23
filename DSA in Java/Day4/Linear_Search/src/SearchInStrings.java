import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Fayaz";
        char target = 'F';
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));

    }

//    public static boolean search(String name, char target){
//        if(name.length()==0){
//            return false;
//        }
//        for(int i = 0; i<name.length(); i++){
//            char ch = name.charAt(i);
//            if(ch==target){
//                return true;
//            }
//        }
//        return false;
//    }

    // for each loop
    public static boolean search(String name, char target){
        if(name.length()==0){
            return false;
        }
        for(char ch: name.toCharArray()){
            if (ch==target){
                return true;
            }
        }
        return false;
    }
}
