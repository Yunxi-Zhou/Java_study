public class Array {
    public static void main(String[] args) {
        int x =0;
        int[] a1 = new int[10];  // 10: how many elements in the array
        int a2[] = new int[5];
        int[] a3 = {1,2,3};


        System.out.println(a1[4]);  // {0,0,0,...}
        System.out.println(a3[1]);  //2
        //System.out.println(a3[3]);  // Index 3 out of bounds for length 3


        a2[0]=-10;
        a2[1]=10;
        System.out.println(a2[0]);
        System.out.println(a2[1]);

        System.out.println(a3);  //[I@123772c4

        System.out.println(toString(a3));







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
