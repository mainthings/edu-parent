package com.edu.factorymethod;

import com.edu.dto.JsDo;
import com.edu.simplefactory.ItDo;

/**
 * @Description js 工厂
 * @author: GT
 * @Date: 2021/2/5 15:00
 * @Version 1.0
 */
public class JsFactoryMethod implements IHrFactoryMethod {
    @Override
    public ItDo getHrFactory() {
        return new JsDo();
    }
}