public class Strings {
    public static void main(String[] args) {
        String s="abcdefghijklmnopqrstuvwxyz";
        System.out.println(s.charAt(2));
        System.out.println(myCharAt(s, -1));

        System.out.println(mySubString(s, 5, 20, 1));
    }

    public static char myCharAt(String s, int i){
        if (i >=0){
            return s.charAt(i);
        }
        return s.charAt(s.length()+i);

        // 长 8 -> 0-7 -> 8 + -1 = 7 -> 找到位置
        
    }

    public static String mySubString(String s, int start, int end, int incr){

        String sub = "";
        for (int i = start; i < end; i += incr) {
            sub += s.charAt(i);

        }

        return sub;

    }
}
