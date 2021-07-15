package com.padingpading.jvm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JvmApplicationTests {



    @Test
    void test1() {
        String s1 = "a" + "b" + "c";
        String s2 = "abc";
        System.out.println(s1==s2);
    }
}
