package com.padingpading.jvm.heap;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.FileNotFoundException;

/**
 * @author libin
 * @description
 * @date 2021-07-08
 */
public class Tlab {
    public static void main(String[] args) {
       // int test = test();
        //System.out.println(test);

    }

    public  int test() {
        int i = 5;
        int b = 3;
        test2();
        return 0;
    }

    public  int test2() throws NullPointerException {

        return 0;
    }
}
