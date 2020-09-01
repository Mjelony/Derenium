package net.mcreator.derenium.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.derenium.DereniumModElements;

import java.util.Map;

@DereniumModElements.ModElement.Tag
public class RubyHammerRightClickedInAirProcedure extends DereniumModElements.ModElement {
	public RubyHammerRightClickedInAirProcedure(DereniumModElements instance) {
		super(instance, 53);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RubyHammerRightClickedInAir!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure RubyHammerRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		entity.attackEntityFrom(DamageSource.ANVIL, (float) 2);
		if (sourceentity instanceof PlayerEntity)
			((PlayerEntity) sourceentity).giveExperiencePoints((int) 5);
	}
}
