package org.example;

public class HardMode implements ChallengeLevelStrategy{
    @Override
    public double getDifficultyScaling() {
        return .10;
    }
}
