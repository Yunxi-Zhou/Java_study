
/*

测试字符类型和bool类型的使用

 */

class VariableTest2 {
    
    
    public static void main(String[] args) {
        // 字符类型 char 2 bytes

        // 表达形式1： ''  \  内部有且只有一个字符 \ Unicode 编码 \ 一个字母，一个汉字都是一个字符


        char c1 = 'a';

        char c2 = '你';
        
        char c3 = '1';

        char c4 = '%';
        
        char c5 = 'Y';


        //char c6 = '';
        //char c7 = 'ab';

        //表达形式2  ' \ uXXXXX'

        char c8 = '\u0036';
        System.out.println(c8);


        // 表达形式3: 使用转义字符

        char c9 = '\n';
        char c10 = '\t';


        System.out.println("hello" + c9 + "world");
        System.out.println("hello" + c10 + "world");


        //表示形式4  使用具体字符对应的数值 ASCII码

        char c11 = 97;

        System.out.println(c11);  //a

        char c12 = '1';
        char c13 = 1;

        System.out.println(c12 + " " + c13);



    
    }








}
