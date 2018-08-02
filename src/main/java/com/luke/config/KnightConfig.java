package com.luke.config;

import com.luke.domain.BraveKnight;
import com.luke.domain.Knight;
import com.luke.domain.SlayDragonQuest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

	public Knight knight(){
		return new BraveKnight(new SlayDragonQuest(System.out));
	}
}
