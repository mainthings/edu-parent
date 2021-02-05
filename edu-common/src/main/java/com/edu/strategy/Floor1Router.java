package com.edu.strategy;

import com.google.common.base.Preconditions;

/**
 * @Description TODO
 * @author: GT
 * @Date: 2021/1/28 10:41
 * @Version 1.0
 */
public class Floor1Router extends AbstractStrategyRouter<String, String>
        implements StrategyHandler<String, String>  {


    @Override
    protected StrategyMapper<String, String> registerStrategyMapper() {
        return new Floor1StrategyMapper();
    }

    @Override
    public String apply(String param) {
        Preconditions.checkArgument(param == null || param.startsWith("1"), "Floor1Router's param must start with 1");
        return applyStrategy(param);
    }

    public static class Floor1StrategyMapper implements StrategyMapper<String, String> {
        @Override
        public StrategyHandler<String, String> get(String param) {
            if (param.startsWith("11")) {
                return param1 -> "你应该想拨110或者119";
            } else if (param.startsWith("12")) {
                return param1 -> "你应该想拨120，这是救护车电话";
            }
            return DEFAULT;
        }
    }


}