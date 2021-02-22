package com.edu.simplefactory;

import com.edu.dto.NetDo;
import com.edu.dto.JavaDo;
import com.edu.dto.JsDo;

/**
 * @Description TODO
 * @author: GT
 * @Date: 2021/2/5 10:27
 * @Version 1.0
 */
public class HrFactory {


    public ItDo getFactory(String person){
        ItDo itDo =null;
        if("JS".endsWith(person)){
            itDo = new JsDo();
        }else if("JAVA".equals(person)){
            itDo = new JavaDo();
        }else if("Net".equals(person)){
            itDo = new NetDo();
        }else {
            System.out.println("没有合适的程序员哦！！！");
        }
        return itDo;
    }

    public static void main(String[] args) {

    }
}