package agents.mod.more.potions.effects;

import agents.mod.AgentsMod;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class Evil extends TemperatureManager
{
	public static void PotionEffect(EntityPlayer player)
	{
		evil++;
	}
	
	public static boolean Malecious()
	{
		if(Evil1 == true)
		{
			return true;
		}
		
		if(Evil2 == true)
		{
			return true;
		}
		
		if(Evil3 == true)
		{
			return true;
		}
		
		return false;
	}
	
	public static boolean Stabilize()
	{
		return false;
	}

	public static void Effect()
	{
		
	}
	
}
