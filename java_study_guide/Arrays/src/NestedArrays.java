import java.util.Arrays;


public class NestedArrays {


    public static void main(String[] args) {


        int[] a = {1,2,3,4};
        int[][] a_a = {{1,5,6},{9},{-1,2,2,4,4,0}};

        //double[][] matrix = new double[3][3];

        double[][] matrix = {{1,6,3},{6,5,8},{3,8,9}};
        double[][] matrix2 = {{1,2,3},{4,5,8},{3,8,9}};
        double[][] matrix3 = getIdentity(10000);
        matrix3[100][200]= 8;










        a_a[2][3] = 12434;

        //System.out.println(Arrays.deepToString(a_a)); // if element is array
        //System.out.println(myToString(getIdentity(5)));
        //System.out.println(myToString(matrix));

        System.out.println(isSymmetric(matrix));
        System.out.println(isSymmetric(matrix2));
        System.out.println(isSymmetric(matrix3));

        System.out.println(isSymmetric(getIdentity(1000)));


        System.out.println(myToString(matrixAdd(matrix,matrix2)));






    }

    public static String myToString(double[][] matrix) {
        String s = "";


        for (double[] row : matrix) {
            s += Arrays.toString(row) + "\n";
        }

        return s;
    }

    //matrix operation

    public static double[][] getIdentity(int n){
        double[][] id = new double[n][n];


        for(int i = 0; i < n; i++){
            id[i][i]=1;
        }




        return id;

    }

    public static boolean isSymmetric(double[][] matrix){



        for(int i = 0; i < matrix.length; i++ ){
            for(int j =0; j<matrix.length; j++){
                if(matrix[i][j]!= matrix[j][i]){
                    return false;
                }
            }
        }





        return true;
    }


    public static double[][] matrixAdd(double[][] m1, double[][] m2){
        double[][] m = new double[m1.length][m1[0].length];

        for(int i = 0; i < m.length; i++ ){
            for(int j =0; j<m[0].length; j++){

                m[i][j] = m1[i][j] + m2[i][j]; 
                




            }
        }
         

        return m;

    }


    

    
}
