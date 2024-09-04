public class Selection_Sort {

    public static void main(String[] args) {
        double[] a1 = {4,8,1,7,9,2,5,3,0};

        //0 8 1 7 2 5 3 4
        //0 1 8 7 2 5 3 4
        //0 1 2 7 8 5 3 4
        //0 1 2 3 8 5 7 4
        //0 1 2 3 4 5 7 8

        selectionSort(a1);
        System.out.println(toString(a1));
    }

    public static void selectionSort(double[] a){

        int index;

        for (int i = 0; i < a.length; i++){
            index = getMin(i,a);
            swapValue(a,index,i);

        }


    }


    public static int getMin(int start, double[] a){


        int minIndex = start;
        double minValue = a[start];

        for (int i = start; i < a.length; i++){
            if(a[i] < minValue){

                minValue = a[i];
                minIndex = i;
            }

        }

        return minIndex;

    }

    public static void swapValue(double[] a, int i, int j){

        double temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        

    }



    public static String toString(double[] a){
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
