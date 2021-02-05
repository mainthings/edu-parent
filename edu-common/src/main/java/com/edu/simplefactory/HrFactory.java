package com.edu.simplefactory;

/**
 * @Description TODO
 * @author: GT
 * @Date: 2021/2/5 10:27
 * @Version 1.0
 */
public class HrFactory {


    public SimpleDo getFactory(String person){
        SimpleDo simpleDo=null;
        if("JS".endsWith(person)){
            simpleDo = new JsDo();
        }else if("JAVA".equals(person)){
            simpleDo = new JavaDo();
        }else if("C".equals(person)){
            simpleDo = new Cdo();
        }else {
            System.out.println("没有合适的程序员哦！！！");
        }
        return simpleDo;
    }
}