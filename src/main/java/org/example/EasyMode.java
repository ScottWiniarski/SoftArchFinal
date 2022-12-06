package org.example;

public class EasyMode implements ChallengeLevelStrategy {
    @Override
    public double getDifficultyScaling() {
        return 0.25;
    }
}
