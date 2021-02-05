package com.edu.factorymethod;

import com.edu.simplefactory.ItDo;

/**
 * @Description  工厂方法测试
 *    现在技术总监需要招1000个各种类型的程序员 技术总监只需要找不同的hr工厂就可以了
 *
 * @author: GT
 * @Date: 2021/2/5 15:08
 * @Version 1.0
 */
public class FactoryMethodTest {


    private static IHrFactoryMethod abstractHrFactory;




    public static void main(String[] args) {
        javaDo();
        jsDo();
        netDo();
    }

    //要招java
    public static void javaDo() {
        abstractHrFactory = new JavaFactoryMethod();
        ItDo itDo = abstractHrFactory.getHrFactory();
        itDo.doing();
    }
    //要招js
    public static void jsDo() {
        abstractHrFactory = new JsFactoryMethod();
        ItDo itDo = abstractHrFactory.getHrFactory();
        itDo.doing();
    }
    //要招net
    public static void netDo() {
        abstractHrFactory = new NetFactoryMethod();
        ItDo itDo = abstractHrFactory.getHrFactory();
        itDo.doing();
    }
}