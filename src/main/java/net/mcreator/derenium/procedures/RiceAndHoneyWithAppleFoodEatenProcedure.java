package net.mcreator.derenium.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.server.MinecraftServer;

import net.mcreator.derenium.DereniumModVariables;
import net.mcreator.derenium.DereniumModElements;

import java.util.Map;

@DereniumModElements.ModElement.Tag
public class RiceAndHoneyWithAppleFoodEatenProcedure extends DereniumModElements.ModElement {
	public RiceAndHoneyWithAppleFoodEatenProcedure(DereniumModElements instance) {
		super(instance, 56);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RiceAndHoneyWithAppleFoodEaten!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		DereniumModVariables.MapVariables.get(world).RiceAndHoneyEaten = (boolean) (true);
		DereniumModVariables.MapVariables.get(world).syncData(world);
		if (((DereniumModVariables.MapVariables.get(world).DebugMode) == (true))) {
			{
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().sendMessage(new StringTextComponent("You have alredy eaten RiceAndHoney"));
			}
		}
	}
}
