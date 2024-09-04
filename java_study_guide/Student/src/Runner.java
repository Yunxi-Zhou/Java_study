public class Runner {
    public static void main(String[] args) throws Exception {
        

        Student a = new Student("A",111);
        Student b = new Student("B",222);
        Student c = new Student("C",233);

        System.out.println(a);  // Student@2d363fb3
        //System.out.println(a.name); A
        //System.out.println(b.name); B
        //System.out.println(b.num);  The field Student.num is not visible

        //a.name = "C";
        //System.out.println(a.name); C

        System.out.println(a.getName());  //A
        System.out.println(a.getNum());  //111
        System.out.println(a.total);  // 3



    }
}
