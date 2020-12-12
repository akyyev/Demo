package com.demo.OCA;

public class Static_Instance_Blocks extends NewClass{
    {
        //System.out.println(a);
        System.out.println("compile error because a hasn't been initialized yet");
    }
    int a = 5;
    static String name = "A";

    public Static_Instance_Blocks(){
        System.out.println("constructor");
    }

    {
        a=6;
        name = "B";
        System.out.println("Instance Block");
    }

    static {
        name = "C";
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        //Static block executed once class loads
        {
            System.out.println("i");
        }
        System.out.println(name);

        Static_Instance_Blocks s = new Static_Instance_Blocks();
        Static_Instance_Blocks s2 = new Static_Instance_Blocks();
        Static_Instance_Blocks s3 = new Static_Instance_Blocks();

        System.out.println(name);
        System.out.println(s3.a);

        //long a = 4123123123; will complain because the number is bigger than int so compile error
        //to fix add l to the end
        long a = 4123123123l;
        /**
         * octal (digits 0–7), which uses the number 0 as a prefix—for example, 017
         * hexadecimal (digits 0–9 and letters A–F), which uses the number 0 followed by x or X as a prefix—for example, 0xFF
         * binary (digits 0–1), which uses the number 0 followed by b or B as a prefix—for exam- ple, 0b10
         */

        System.out.println(0b111);//111 => 1+2+4 = 7
        System.out.println(027); // octal 2*8+7=16+7=23
    }


}

class NewClass{
    {
        System.out.println("instance block-super");
    }

    static {
        System.out.println("static block-super");
    }

}

