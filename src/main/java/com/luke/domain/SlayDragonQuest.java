package com.luke.domain;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {
	private PrintStream stream;

	public SlayDragonQuest(PrintStream stream){
		this.stream = stream;
	}

	public void emark() {
		stream.println("mission completed");
	}
}
