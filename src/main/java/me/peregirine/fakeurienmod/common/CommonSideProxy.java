package me.peregirine.fakeurienmod.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class CommonSideProxy {

	public void registerRenderers()
	{

	}

	public World getClientWorld() {

		return null;
	}
	public void registerClientInfo(){}
	public boolean isThePlayer(EntityPlayer player)
	{
		return false;
	}

}
