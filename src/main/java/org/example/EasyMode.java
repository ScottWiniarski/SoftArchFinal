package org.example;

public class EasyMode implements ChallengeLevel{
    @Override
    public double getDifficultyScaling() {
        return 0.25;
    }
}
