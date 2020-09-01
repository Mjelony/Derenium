package net.mcreator.derenium.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.derenium.item.RubySwordItem;
import net.mcreator.derenium.item.RubyShovelItem;
import net.mcreator.derenium.item.RubyPickaxeItem;
import net.mcreator.derenium.item.RubyHoeItem;
import net.mcreator.derenium.item.RubyAxeItem;
import net.mcreator.derenium.item.RubyArmorItem;
import net.mcreator.derenium.DereniumModElements;

import java.util.Map;

@DereniumModElements.ModElement.Tag
public class RubyEquipmentCommandExecutedProcedure extends DereniumModElements.ModElement {
	public RubyEquipmentCommandExecutedProcedure(DereniumModElements instance) {
		super(instance, 25);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RubyEquipmentCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(RubySwordItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(RubyPickaxeItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(RubyAxeItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(RubyShovelItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(RubyHoeItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).inventory.armorInventory.set(0, new ItemStack(RubyArmorItem.boots, (int) (1)));
			if (entity instanceof ServerPlayerEntity)
				((ServerPlayerEntity) entity).inventory.markDirty();
		}
		/* @ItemStack */if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).inventory.armorInventory.set(1, new ItemStack(RubyArmorItem.legs, (int) (1)));
			if (entity instanceof ServerPlayerEntity)
				((ServerPlayerEntity) entity).inventory.markDirty();
		}
		/* @ItemStack */if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).inventory.armorInventory.set(2, new ItemStack(RubyArmorItem.body, (int) (1)));
			if (entity instanceof ServerPlayerEntity)
				((ServerPlayerEntity) entity).inventory.markDirty();
		}
		/* @ItemStack */if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).inventory.armorInventory.set(3, new ItemStack(RubyArmorItem.helmet, (int) (1)));
			if (entity instanceof ServerPlayerEntity)
				((ServerPlayerEntity) entity).inventory.markDirty();
		}
		/* @ItemStack */
	}
}
