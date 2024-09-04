public class Ifs {
    public static void main(String[] args) {
        System.out.println(getTemp(5));
        System.out.println(getTemp(25));
        System.out.println(getTemp(55));

        System.out.println(isLong("abc", "12fuyfu"));
        System.out.println(isLong("abc", "12"));


        

    }

    public static String getTemp(int temp) {
        if (temp>30){
            return "hot";
        }
        if (temp>20 /*&& temp<30*/){
            return "warm";
        }
        return "cold";
    }

    public static boolean isLong(String s1, String s2){
        return s1.length()>s2.length();
    }

    

}
