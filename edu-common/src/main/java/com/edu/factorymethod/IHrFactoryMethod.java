package com.edu.factorymethod;

import com.edu.simplefactory.ItDo;

/**
 * @Description 需要什么类型的程序员呢！！！
 * @author: GT
 * @Date: 2021/2/5 14:54
 * @Version 1.0
 */
public interface IHrFactoryMethod {
       /**
        *  hr 工厂
        * @Author GT
        * @Date 2021/2/5 14:59
        * @Param []
        * @return com.edu.simplefactory.ItDo
        **/
       public ItDo getHrFactory();
}