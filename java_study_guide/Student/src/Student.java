public class Student {

    public static int total = 0;  //anything static* is associated with the class not the object

    private String name;
    private int num;


    public Student(String inName, int inNum){

        name = inName;
        num = inNum;
        total++;


    }

    public int getNum(){
        return num;
    }
    

    public String getName(){
        return name;
    }
}
