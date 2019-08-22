package com.sirniloc.yam.classes.skills.active;

import com.sirniloc.yam.character.capability.YAM;
import com.sirniloc.yam.classes.skills.SkillActive;

public class TippedArrows extends SkillActive{
	
	static final int ID = 7;
	public TippedArrows() {
		super("Tipped Arrows", 0, 0, 0);
	}

	@Override
	public boolean doSkillStuff(YAM caster) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getID() {
		return ID;
	}

}
