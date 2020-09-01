package net.mcreator.derenium.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.derenium.DereniumModVariables;
import net.mcreator.derenium.DereniumModElements;

import java.util.Map;
import java.util.Iterator;

@DereniumModElements.ModElement.Tag
public class TastyFoodsProcedureProcedure extends DereniumModElements.ModElement {
	public TastyFoodsProcedureProcedure(DereniumModElements instance) {
		super(instance, 58);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TastyFoodsProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure TastyFoodsProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((DereniumModVariables.MapVariables.get(world).RiceAndHoneyEaten) == (true))
				&& ((DereniumModVariables.MapVariables.get(world).RiceEaten) == (true)))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).giveExperiencePoints((int) 5);
			if (entity instanceof ServerPlayerEntity) {
				Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager()
						.getAdvancement(new ResourceLocation("derenium:tasty_foods"));
				AdvancementProgress _ap = ((ServerPlayerEntity) entity).getAdvancements().getProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemaningCriteria().iterator();
					while (_iterator.hasNext()) {
						String _criterion = (String) _iterator.next();
						((ServerPlayerEntity) entity).getAdvancements().grantCriterion(_adv, _criterion);
					}
				}
			}
		}
	}
}
