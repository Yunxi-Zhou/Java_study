public class NestedLoop {
    

    public static void main(String[] args) {
        nested(5,5);

        //nested(0,0),(1,0) nothing
    }


    public static void nested(int outer, int inner) {



        for (int i = 0; i < outer; i++){
            for (int j = 0; j < inner; j = j+i+1){
                for(int k = 0; k < inner; k = k+i+1){
                    System.out.println("i" + i +", j"+  j +", k" +k);
                }
            }
        }

    }

}
