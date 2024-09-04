class VariableTest1 {
    public static void main(String[] args) {

        // 整型
        // byte (1 byte = 8 bits) \ short = 2 bytes \ int = 4 bytes \ long = 8 bytes


        byte b1 = 12;
        byte b2 = 127;
        // byte b3 = 128;

        short s1 = 1234;

        int i1 = 123423;

        long l1 = 1234L;   // long需要后缀，后缀为L or l

        // 浮点型
        // float (需要后缀 f or F) 7 位 \ double  14 位

        double d1 = 12.3;
        float f1 = 12.3f;

        System.out.println("f1 = " + f1);

        System.out.println(0.1+0.2);



        // Test 2
        float ff1 = 123123123f;
        float ff2 = ff1 + 1;
        System.out.println(ff1);
        System.out.println(ff2);
        System.out.println(ff1==ff2);


    }
}
