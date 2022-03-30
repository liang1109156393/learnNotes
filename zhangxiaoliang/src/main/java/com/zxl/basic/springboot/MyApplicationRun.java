package com.zxl.basic.springboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;
import org.springframework.boot.ApplicationRunner;

import static java.lang.System.out;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/29 8:58
 */
@Component
public class MyApplicationRun implements ApplicationRunner{
    @Override
    public void run(ApplicationArguments args) throws Exception {
        out.print("MyApplicationRun======"+args.toString());
    }
}
