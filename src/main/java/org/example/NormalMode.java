package org.example;

public class NormalMode implements ChallengeLevelStrategy{
    @Override
    public double getDifficultyScaling() {
        return .175;
    }
}
