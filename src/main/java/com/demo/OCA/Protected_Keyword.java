package com.demo.OCA;

import com.demo.Interview_Questions.Switch_zeros;

public class Protected_Keyword extends Switch_zeros{

    public static void main(String[] args) {
        Switch_zeros s = new Switch_zeros();
        int a = s.zeroOrOne;
        //String name = s.name;

        Protected_Keyword p = new Protected_Keyword();
        String name = p.name; // name field is protected on switch_zeros class...
        // in order to call 'name' create an object of subclass...
        // protected  --> package + sub...
    }

}
