package org.straygedemo.strategy;

/**
 * StrategyHolder 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @version: v1.0.0
 **/
public class StrategyHolder {
    private static Strategy strategy;

    public static void setStrategy(Strategy strategy) {
        StrategyHolder.strategy = strategy;
    }

    public static void execStrategy(){
        strategy.exec();
    }

}
