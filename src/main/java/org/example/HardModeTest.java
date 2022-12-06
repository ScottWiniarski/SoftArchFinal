package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HardModeTest {

    @Test
    void getDifficultyScaling() {
        ChallengeLevelStrategy ch = new HardMode();
        assertEquals(0.1,ch.getDifficultyScaling());
        //assertEquals(0.25,ch.getDifficultyScaling());
    }
}