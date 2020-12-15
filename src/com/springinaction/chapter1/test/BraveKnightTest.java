package com.springinaction.chapter1.test;

import com.springinaction.chapter1.entity.BraveKnight;
import com.springinaction.chapter1.entity.Quest;
import org.junit.Test;

import static org.mockito.Mockito.*;

class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
