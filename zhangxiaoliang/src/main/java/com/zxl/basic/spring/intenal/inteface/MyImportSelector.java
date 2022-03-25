package com.zxl.basic.spring.intenal.inteface;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/7 16:43
 * 导入bean到spring中
 */
@Component
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{ImportSelectorBean.class.getName()};
    }

    public class ImportSelectorBean {
        public void testImportSelectorBean() {
            System.out.println("testImportSelectorBean=======================");
        }
    }

}

