package com.zxl.basic.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/29 9:00
 */
@Component
public class MyCommandLineRun implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCommandLineRun=========="+Arrays.toString(args));
    }
}
