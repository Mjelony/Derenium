package net.mcreator.derenium.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.server.MinecraftServer;

import net.mcreator.derenium.DereniumModVariables;
import net.mcreator.derenium.DereniumModElements;

import java.util.Map;

@DereniumModElements.ModElement.Tag
public class DebugToggleCommandCommandExecutedProcedure extends DereniumModElements.ModElement {
	public DebugToggleCommandCommandExecutedProcedure(DereniumModElements instance) {
		super(instance, 56);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DebugToggleCommandCommandExecuted!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (((DereniumModVariables.MapVariables.get(world).DebugMode) == (false))) {
			DereniumModVariables.MapVariables.get(world).DebugMode = (boolean) (true);
			DereniumModVariables.MapVariables.get(world).syncData(world);
			{
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().sendMessage(new StringTextComponent("Debug Mode is curently on"));
			}
		} else {
			DereniumModVariables.MapVariables.get(world).DebugMode = (boolean) (false);
			DereniumModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
