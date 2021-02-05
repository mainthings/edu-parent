package com.edu.factorymethod;

import com.edu.dto.JavaDo;
import com.edu.simplefactory.ItDo;

/**
 * @Description java 工厂
 * @author: GT
 * @Date: 2021/2/5 15:02
 * @Version 1.0
 */
public class JavaFactoryMethod implements IHrFactoryMethod {
    @Override
    public ItDo getHrFactory() {
        return new JavaDo();
    }
}