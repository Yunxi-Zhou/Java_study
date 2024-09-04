public class Boolean {

    public static void main(String[] args) {
        boolean b1 = true, b2 = false;


        System.out.println(3!=8);
        System.out.println(4 == 5.2);
        System.out.println(3<=3);
        System.out.println(3>=8);
        System.out.println(63.6>-1);
        System.out.println(-3<-8);

        System.out.println("--------------------------------");

        /*
        System.out.println(b1 & b1);
        System.out.println(b1 & b2);
        System.out.println(b2 & b1);
        System.out.println(b2 & b2);
         */



        System.out.println(5>2 && 9<5);

        System.out.println(5<2 && 9/0>5);  // i don't need to evaluate second value if in && first is false , then ans is false


        System.out.println("--------------------------------");

        // difference between || and | , && and &
        
        System.out.println(true || 1/0<6);  // same as above
        //System.out.println(true | 1/0<6);  //  Exception in thread "main" java.lang.ArithmeticException: / by zero


        System.out.println(false || false);
        System.out.println(false || true);






    }
    
}
