package com.edu.simplefactory;

/**
 * @Description 简单工厂测试
 * @author: GT
 * @Date: 2021/2/5 10:29
 * @Version 1.0
 */
public class TestSimpleDo {

    public static void main(String[] args) {
             HrFactory hrFactory=new HrFactory();
             // JAVA JS C
             SimpleDo simpleDo=hrFactory.getFactory("C");
             simpleDo.doing();
    }
}