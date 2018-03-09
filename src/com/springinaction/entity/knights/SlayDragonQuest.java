package com.springinaction.entity.knights;

import java.io.PrintStream;

import com.springinaction.entity.quest.Quest;

public class SlayDragonQuest implements Quest{

	private PrintStream stream;
	
	public SlayDragonQuest(PrintStream stream) {
		this.stream = stream;
	}
	
	@Override
	public void embark() {
		stream.println("Embark on quest to slay the dragon!");
	}

}
