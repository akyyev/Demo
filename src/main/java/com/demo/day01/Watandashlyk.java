package com.demo.day01;

public interface Watandashlyk {

    void watandashlykAl(String yurdyng);
    void watandashlykCyk(String yurtdan);

    boolean vizaAlmakGerekmi();

    default void bilinmeyanMethod(){
        System.out.println("Men watandashlyk interface den yazyan");
    }

    static void m1(){

    }

}
