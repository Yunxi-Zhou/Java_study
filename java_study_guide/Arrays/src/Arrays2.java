public class Arrays2 {

    public static void main(String[] args) {
        int[] a1={1,2,3,4,5};
        int[] a2;
        int[] a3;

        /* 
        a2=a1;
        System.out.println(toString(a1));
        System.out.println(toString(a2));
        a1[2]=-3;
        System.out.println(toString(a1));


        //mutations
        a2[4]=-5;
        System.out.println(toString(a2));  //{1,2,-3,4,-5}
        System.out.println(toString(a1));  //{1,2,-3,4,-5}
        */


        System.out.println(toString(a1));
        a2 = doubleArray(a1);
        System.out.println(toString(a1));
        System.out.println(toString(a2));

        a3 = doubleArray(a2);
        System.out.println(toString(a1));
        System.out.println(toString(a2));
        System.out.println(toString(a3));




    }


    public static int[] doubleArray(int[] a){
        int[] myA = a;
        for (int i = 0; i < a.length; i++){
            myA[i]=2*myA[i];
        }
        return myA;

    }
    

    public static String toString(int[] a){
        String s = "{";

        for (int i = 0; i < a.length; i++){

            if (i == a.length -1) {
                s = s + a[i];
            }
            else{
                s=s+a[i]+",";
            }


        }

        return s + "}";
    }
}
