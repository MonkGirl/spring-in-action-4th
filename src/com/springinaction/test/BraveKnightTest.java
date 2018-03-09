package com.springinaction.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

import com.springinaction.entity.knights.BraveKnight;
import com.springinaction.entity.quest.Quest;

class BraveKnightTest {

	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}
}
