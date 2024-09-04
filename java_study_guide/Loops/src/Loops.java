public class Loops {
    public static void main(String[] args) throws Exception {


        String s="abcdefghijklmnopqrstuvwxyz";
        printString(s);
        printString2(s);

        loop();
    }


        /*
        for (Statement,Statement,Statement){
            body
        }
         */


    public static void printString(String s) {
        for (int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }


    public static void printString2(String s){
        for (char chr : s.toCharArray()){
            System.out.println(chr);
        }
    }


    public static void loop(){
        for (int i = 7; i < 50; i+=5){
            System.out.println(i);
            i -= 2;
        }
    }


    
}
