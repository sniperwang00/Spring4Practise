package com.luke.knights;

import com.luke.minstrel.Minstrel;
import com.luke.quests.Quest;
import org.springframework.context.annotation.Profile;


@Profile("dev")
public class BraveKnight implements Knight{
	private Quest quest;

//	private Minstrel minstrel;

/*	public BraveKnight(Quest quest, Minstrel minstrel){
		this.quest = quest;
		this.minstrel = minstrel;
	}*/

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	public void embarkOnQuest() {
//		minstrel.singBeforeQuest();
		quest.emark();
//		minstrel.singAfterQuest();
	}
}
