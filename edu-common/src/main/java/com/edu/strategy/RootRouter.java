package com.edu.strategy;

/**
 * @Description TODO
 * @author: GT
 * @Date: 2021/1/28 10:40
 * @Version 1.0
 */
public class RootRouter extends AbstractStrategyRouter<String, String> {

    @Override
    protected StrategyMapper<String, String> registerStrategyMapper() {
        return new RootStrategyMapper();
    }

    public static class RootStrategyMapper implements StrategyMapper<String, String> {
        @Override
        public StrategyHandler<String, String> get(String param) {
            if (param.startsWith("1")) {
                return param1 -> new Floor1Router().apply(param1);
            } else if (param.startsWith("9")) {
                return param1 -> "你是想拨999吧";
            }
            return param1 -> "不知道你丫想干嘛";
        }
    }


}