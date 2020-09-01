package net.mcreator.derenium.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.block.Block;

import net.mcreator.derenium.DereniumModElements;

import java.util.Map;

@DereniumModElements.ModElement.Tag
public class RubyHammerBlockDestroyedWithToolProcedure extends DereniumModElements.ModElement {
	public RubyHammerBlockDestroyedWithToolProcedure(DereniumModElements instance) {
		super(instance, 49);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RubyHammerBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RubyHammerBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RubyHammerBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RubyHammerBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RubyHammerBlockDestroyedWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((entity.rotationYaw) >= 0) && ((entity.rotationYaw) < 90)) || (((entity.rotationYaw) >= 180) && ((entity.rotationYaw) < 270)))) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), false);
		}
		if (((((entity.rotationYaw) >= 90) && ((entity.rotationYaw) < 180)) || (((entity.rotationYaw) >= 270) && ((entity.rotationYaw) <= 360)))) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), world.getWorld(),
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), false);
		}
	}
}
